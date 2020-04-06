package sun.com.history.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import sun.com.history.R;
import sun.com.history.base.BaseActivity;
import sun.com.history.base.ContentURL;
import sun.com.history.bean.HistoryDescBean;

public class HistoryDescActivity extends BaseActivity implements View.OnClickListener {

    private ImageView backIv, shareIv, picIv;
    private TextView titleTv;
    private TextView contentTv;
    HistoryDescBean historyDescBean;
    private String historyId;
    private HistoryDescBean.ResultBean resultBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_desc);

        backIv = findViewById(R.id.desc_back);
        shareIv = findViewById(R.id.desc_share);
        picIv = findViewById(R.id.desc_iv_pic);
        titleTv = findViewById(R.id.desc_tv_title);
        contentTv = findViewById(R.id.desc_tv_content);
        backIv.setOnClickListener(this);
        shareIv.setOnClickListener(this);

        historyId = getIntent().getStringExtra("historyId");
        String historyDescURL = ContentURL.getHistoryDescURL("1.0", historyId);

        //加载数据
        loadData(historyDescURL);
    }

    @Override
    public void onSuccess(String result) {
        //解析并显示数据
        historyDescBean = new Gson().fromJson(result, HistoryDescBean.class);
        resultBean = historyDescBean.getResult().get(0);
        titleTv.setText(resultBean.getTitle());
        contentTv.setText(resultBean.getContent());
        String picURL = resultBean.getPic();
        if (TextUtils.isEmpty(picURL)) {
            picIv.setVisibility(View.GONE);
        } else {
            picIv.setVisibility(View.VISIBLE);
            Picasso.with(this).load(picURL).into(picIv);
        }


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.desc_back:
                finish();
                break;
            case R.id.desc_share:
                //分享功能
                String text="我发现一款好玩的软件-历史上的今天，快来一起探索这个APP吧！";
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,text);
                startActivity(Intent.createChooser(intent,"历史上的今天"));
                break;
                default:
                    break;
        }
    }
}

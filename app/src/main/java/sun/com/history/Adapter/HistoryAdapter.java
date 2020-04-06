package sun.com.history.Adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import sun.com.history.R;
import sun.com.history.bean.Historybean;

/**
 * Created by Administrator on 2020/3/1 0001.
 */

public class HistoryAdapter extends BaseAdapter {
    Context context;
    private List<Historybean.ResultBean> mDatas;

    //构造器
    public HistoryAdapter(Context context, List<Historybean.ResultBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;

    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //性能优化
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.avtivity_timeline, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Historybean.ResultBean resultBean = mDatas.get(position);
        String title=resultBean.getTitle();
        holder.titleTv.setText(title);
        int year=resultBean.getYear();
        int month=resultBean.getMonth();
        int day=resultBean.getDay();
        holder.timeTv.setText(year+"-"+month+"-"+day);

        //判断图片url是否存在
        String url = resultBean.getPic();

        if (TextUtils.isEmpty(url)) {
            holder.picIv.setVisibility(View.GONE);
        } else {
            holder.picIv.setVisibility(View.VISIBLE);
            //解析图片
            Picasso.with(context).load(url).into(holder.picIv);
        }


        return convertView;
    }

    class ViewHolder {
        TextView timeTv, titleTv;
        ImageView picIv;

        public ViewHolder(View itemview) {
            timeTv = itemview.findViewById(R.id.tv_line_time);
            titleTv = itemview.findViewById(R.id.iv_main_title);
            picIv = itemview.findViewById(R.id.iv_main_pic);

        }
    }

}

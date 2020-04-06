package sun.com.history.base;

import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.Toast;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

/**
 * Created by Administrator on 2020/3/1 0001.
 */

public class BaseActivity extends AppCompatActivity implements Callback.CommonCallback<String> {

    public void loadData(String url) {
        RequestParams requestParams = new RequestParams(url);
        x.http().get(requestParams, this);
    }

    @Override
    public void onSuccess(String result) {
//        Toast.makeText(x.app(), (Integer) result, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {

        Toast.makeText(x.app(), ex.getMessage(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCancelled(CancelledException cex) {
        Toast.makeText(x.app(), "cancelled", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFinished() {
        Toast.makeText(getApplicationContext(), "加载完成!", Toast.LENGTH_SHORT).show();

    }
}

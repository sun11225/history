package sun.com.history;

import android.app.Application;
import android.util.Log;

import org.xutils.x;

//import cn.bmob.v3.Bmob;
import cn.jiguang.verifysdk.api.JVerificationInterface;
import cn.jiguang.verifysdk.api.RequestCallback;

/**
 * Created by Administrator on 2020/3/1 0001.
 */

public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();


        //第一：默认初始化
//        Bmob.initialize(this, "361f903f2baea23010010be4dea69aa7");

        //xutil框架初始化
        x.Ext.init(this);

        JVerificationInterface.setDebugMode(true);
        final long start = System.currentTimeMillis();
        JVerificationInterface.init(this, new RequestCallback<String>() {
            @Override
            public void onResult(int code, String result) {
                Log.d("MyApp", "[init] code = " + code + " result = " + result + " consists = " + (System.currentTimeMillis() - start));
            }
        });
    }

        //开启dubug日志
//        x.Ext.setDebug(BuildConfig.DEBUG);



}

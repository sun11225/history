package sun.com.history.base;

/**
 * Created by Administrator on 2020/3/1 0001.
 */

public class ContentURL {

    //获取指定日期对应的历史上的今日的网址
    public static String getTadayHistoryURL(String version, int month, int day) {
        String URL = "http://api.juheapi.com/japi/toh?v=" + version + "&month=" + month + "&day=" + day + "&key=fb598ec8e79d5f67f624c42249c2f057";
        return URL;
    }

    //获取指定日期的老黄历的网址
    public static String getLaoHuangLiURL(String date) {
        String URL = "http://v.juhe.cn/laohuangli/d?date=" +date+ "&key=93407f6931a06116f026da769423e520";
        return URL;

    }

    //根据事件id获取详细信息
    public static String getHistoryDescURL(String version,String id){
        String URL="http://api.juheapi.com/japi/tohdet?key=fb598ec8e79d5f67f624c42249c2f057&v="+version+"&id="+id+"";
        return URL;
    }

}

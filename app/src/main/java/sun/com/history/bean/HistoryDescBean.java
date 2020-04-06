package sun.com.history.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2020/3/5 0005.
 */

public class HistoryDescBean implements Serializable {

    /**
     * result : [{"_id":"1380301","title":"张衡发明制造候风地动仪\u201c显灵验\u201d","pic":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/toh/201003/2/24132317315.jpg","year":138,"month":3,"day":1,"des":"在1882年前的今天，0138年3月1日 (农历二月初三)，张衡发明制造候风地动仪\u201c显灵验\u201d。","content":"在1882年前的今天，0138年3月1日 (农历二月初三)，张衡发明制造候风地动仪\u201c显灵验\u201d。\n132年，科学家、文学家张衡发明制造了世界上第一台测定地震方位的仪器--候风地动仪。张衡将候风地动仪安置在都城洛阳。起初，满朝文武都不相信这台地动仪能够测出地震的方向。\n凑巧138年3月1日（汉永和三年二月初三日，距今已1882年）突然地动仪朝向西北方向的钢球落了下来，掉进仪器下面的蟾蜍口里。可是，洛阳居民谁也没有感觉到地震。几天后，陇西驿者日夜奔驰来京师，报告陇西地震，二郡山崩（震级约为6.5级）。陇西正好在洛阳的西北方向。\n在事实面前，大家都不得不承认候风地动仪的灵验，佩服张衡的发明。\n相隔1700多年，欧洲人才制造出\u201c第一台\u201d地动仪。\n","lunar":"戊寅年二月初三"}]
     * reason : 请求成功！
     * error_code : 0
     */

    private String reason;
    private int error_code;
    private List<ResultBean> result;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean implements Serializable {
        /**
         * _id : 1380301
         * title : 张衡发明制造候风地动仪“显灵验”
         * pic : http://juheimg.oss-cn-hangzhou.aliyuncs.com/toh/201003/2/24132317315.jpg
         * year : 138
         * month : 3
         * day : 1
         * des : 在1882年前的今天，0138年3月1日 (农历二月初三)，张衡发明制造候风地动仪“显灵验”。
         * content : 在1882年前的今天，0138年3月1日 (农历二月初三)，张衡发明制造候风地动仪“显灵验”。
         132年，科学家、文学家张衡发明制造了世界上第一台测定地震方位的仪器--候风地动仪。张衡将候风地动仪安置在都城洛阳。起初，满朝文武都不相信这台地动仪能够测出地震的方向。
         凑巧138年3月1日（汉永和三年二月初三日，距今已1882年）突然地动仪朝向西北方向的钢球落了下来，掉进仪器下面的蟾蜍口里。可是，洛阳居民谁也没有感觉到地震。几天后，陇西驿者日夜奔驰来京师，报告陇西地震，二郡山崩（震级约为6.5级）。陇西正好在洛阳的西北方向。
         在事实面前，大家都不得不承认候风地动仪的灵验，佩服张衡的发明。
         相隔1700多年，欧洲人才制造出“第一台”地动仪。

         * lunar : 戊寅年二月初三
         */

        private String _id;
        private String title;
        private String pic;
        private int year;
        private int month;
        private int day;
        private String des;
        private String content;
        private String lunar;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getLunar() {
            return lunar;
        }

        public void setLunar(String lunar) {
            this.lunar = lunar;
        }
    }
}

package sun.com.history.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2020/3/1 0001.
 */

public class LaoHuangLi implements Serializable {
    /**
     * reason : successed
     * result : {"id":"1459","yangli":"2014-02-22","yinli":"甲午(马)年正月廿三","wuxing":"海中金 开执位","chongsha":"冲马(戊午)煞南","baiji":"甲不开仓财物耗散 子不问卜自惹祸殃","jishen":"天恩 母仓 时阳 生气 益後 青龙","yi":" 嫁娶 祭祀 开光 祈福 求嗣 出行 开市 交易 立券 动土 纳财 掘井 会亲友","xiongshen":"灾煞 天火 四忌 复日","ji":"入宅 安葬 伐木 作梁 纳畜 造畜稠 作灶"}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * id : 1459
         * yangli : 2014-02-22
         * yinli : 甲午(马)年正月廿三
         * wuxing : 海中金 开执位
         * chongsha : 冲马(戊午)煞南
         * baiji : 甲不开仓财物耗散 子不问卜自惹祸殃
         * jishen : 天恩 母仓 时阳 生气 益後 青龙
         * yi :  嫁娶 祭祀 开光 祈福 求嗣 出行 开市 交易 立券 动土 纳财 掘井 会亲友
         * xiongshen : 灾煞 天火 四忌 复日
         * ji : 入宅 安葬 伐木 作梁 纳畜 造畜稠 作灶
         */

        private String id;
        private String yangli;
        private String yinli;
        private String wuxing;
        private String chongsha;
        private String baiji;
        private String jishen;
        private String yi;
        private String xiongshen;
        private String ji;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getYangli() {
            return yangli;
        }

        public void setYangli(String yangli) {
            this.yangli = yangli;
        }

        public String getYinli() {
            return yinli;
        }

        public void setYinli(String yinli) {
            this.yinli = yinli;
        }

        public String getWuxing() {
            return wuxing;
        }

        public void setWuxing(String wuxing) {
            this.wuxing = wuxing;
        }

        public String getChongsha() {
            return chongsha;
        }

        public void setChongsha(String chongsha) {
            this.chongsha = chongsha;
        }

        public String getBaiji() {
            return baiji;
        }

        public void setBaiji(String baiji) {
            this.baiji = baiji;
        }

        public String getJishen() {
            return jishen;
        }

        public void setJishen(String jishen) {
            this.jishen = jishen;
        }

        public String getYi() {
            return yi;
        }

        public void setYi(String yi) {
            this.yi = yi;
        }

        public String getXiongshen() {
            return xiongshen;
        }

        public void setXiongshen(String xiongshen) {
            this.xiongshen = xiongshen;
        }

        public String getJi() {
            return ji;
        }

        public void setJi(String ji) {
            this.ji = ji;
        }
    }
}

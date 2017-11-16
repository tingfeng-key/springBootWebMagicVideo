package cn.ijuyingyuan.Enum;

/**
 * Created by feizhugame on 2017/11/16.
 */
public enum AlbumParseType {
    TENGXUN(1, "腾讯"),
    YOUKU(2, "优酷"),
    IQIYI(3, "爱奇艺"),
    LESHI(4, "乐视"),
    ;

    private Integer value;
    private String message;

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    private AlbumParseType(Integer value, String message){
        this.value = value;
        this.message = message;
    }
}

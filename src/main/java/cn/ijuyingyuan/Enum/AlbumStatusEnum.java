package cn.ijuyingyuan.Enum;

/**
 * Created by feizhugame on 2017/11/16.
 */
public enum AlbumStatusEnum {
    CREATE(1, "收录"),
    UPDATE(2, "更新"),
    FINASHED(3, "完结"),
    DELETE(4, "下架")
    ;

    private int value;
    private String message;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    private AlbumStatusEnum(Integer value, String message){
        this.value = value;
        this.message = message;
    }
}

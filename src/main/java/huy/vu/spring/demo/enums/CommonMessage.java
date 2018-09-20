package huy.vu.spring.demo.enums;

public enum CommonMessage {
    UNKNOW("E99999","unknow");
    private String code;
    private String msg;

    private CommonMessage(String code, String msg){
        this.code =  code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

package huy.vu.spring.demo.enums;

public enum BussinessExceptionEnum {
    SUCCESS("0","Success"),
    ENTITY_NOT_FOUND("E001","entity not found");
    private String code;
    private String msg;

    private BussinessExceptionEnum(String code, String msg){
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

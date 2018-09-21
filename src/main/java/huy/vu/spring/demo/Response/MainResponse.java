package huy.vu.spring.demo.Response;

import huy.vu.spring.demo.enums.CommonMessage;
import lombok.Data;

@Data
public class MainResponse<T> {
    private String code;
    private String msg;
    private T data;

    public MainResponse(CommonMessage msg){
        this.code=  msg.getCode();
        this.msg = msg.getMsg();
    }

    public MainResponse(String code, String msg){
        this.code=  code;
        this.msg = msg;
    }
    public MainResponse(){

    }
}

package huy.vu.spring.demo.Response;

import huy.vu.spring.demo.enums.CommonMessage;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MainResponse<T> {
    private String code;
    private String msg;
    private T data;
    public MainResponse(String code, String msg){
        this.code=  code;
        this.msg = msg;
    }
    public MainResponse(CommonMessage msg){
        this.code=  msg.getCode();
        this.msg = msg.getMsg();
    }


}

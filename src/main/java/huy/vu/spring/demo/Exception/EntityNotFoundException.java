package huy.vu.spring.demo.Exception;

import huy.vu.spring.demo.enums.BussinessExceptionEnum;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class EntityNotFoundException extends RuntimeException{
    private String errorCode;
    private String errorMsg;
    private HttpStatus httpStatus;

    public EntityNotFoundException(BussinessExceptionEnum exception){
        super();
        this.errorCode = exception.getCode();
        this.errorMsg = exception.getMsg();
        this.httpStatus = HttpStatus.BAD_REQUEST;
    }
    public EntityNotFoundException(BussinessExceptionEnum exception, HttpStatus status){
        super();
        this.errorCode = exception.getCode();
        this.errorMsg = exception.getMsg();
        this.httpStatus = status;
    }
}

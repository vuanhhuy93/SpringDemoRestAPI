package huy.vu.spring.demo.common;

import huy.vu.spring.demo.Exception.EntityNotFoundException;
import huy.vu.spring.demo.Response.MainResponse;
import huy.vu.spring.demo.enums.CommonMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandle extends ResponseEntityExceptionHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseBody
    public ResponseEntity<?> handleCustomizedException(EntityNotFoundException e) {
        return new ResponseEntity<MainResponse>(new MainResponse(e.getErrorCode(),e.getErrorMsg()),e.getHttpStatus());
    }
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<?> handleInternalException(Exception ex) {
        return new ResponseEntity<MainResponse>(new MainResponse(CommonMessage.UNKNOW), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

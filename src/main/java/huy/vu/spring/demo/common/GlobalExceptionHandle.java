package huy.vu.spring.demo.common;

import huy.vu.spring.demo.Exception.EntityNotFoundException;
import huy.vu.spring.demo.Response.MainResponse;
import huy.vu.spring.demo.enums.CommonMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandle extends ResponseEntityExceptionHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseBody
    public ResponseEntity<?> handleCustomizedException(EntityNotFoundException e) {
        return new ResponseEntity<MainResponse>(new MainResponse(e.getErrorCode(),e.getErrorMsg()),e.getHttpStatus());
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ResponseEntity responseEntity = new ResponseEntity<MainResponse>(new MainResponse(CommonMessage.INVALID_REQUEST),headers, HttpStatus.BAD_REQUEST);
        return responseEntity;
    }

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ResponseEntity responseEntity = new ResponseEntity<MainResponse>(new MainResponse(CommonMessage.INVALID_REQUEST),headers, HttpStatus.BAD_REQUEST);
        return responseEntity;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<?> handleInternalException(Exception ex) {
        return new ResponseEntity<MainResponse>(new MainResponse(CommonMessage.UNKNOW), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

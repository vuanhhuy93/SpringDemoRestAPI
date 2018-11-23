package huy.vu.spring.demo.controller;

import huy.vu.spring.demo.Response.MainResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseController {
    public ResponseEntity<MainResponse> returnSuccess(MainResponse response){
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
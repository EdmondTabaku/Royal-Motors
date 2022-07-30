package com.yy.royalmotors.controller;

import com.yy.royalmotors.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    public ResponseEntity<?> save(UserDto userDto){
        return ResponseEntity.ok(null);
    }
}

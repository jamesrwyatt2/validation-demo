package com.jwctech.validationdemo;

import jakarta.validation.Valid;
import jakarta.validation.ValidationException;
import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Pattern;

@RestController
public class MainController {

    private static final Logger LOG = LoggerFactory.getLogger(MainController.class);

    @RequestMapping("/")
    public ResponseEntity<Object> addUser(
//            @Valid @RequestBody
                                              User user) {

//        if(user.getName() == null) {
//            return ResponseEntity.badRequest().body("Name is required");
//        } else if(user.getName().length() < 3) {
//            return ResponseEntity.badRequest().body("Name must be at least 3 characters");
//        } else if(user.getName().length() > 30) {
//            return ResponseEntity.badRequest().body("Name is too long");
//        }
//        if(user.getPassword() == null) {
//            return ResponseEntity.badRequest().body("Password is required");
//        }else if(user.getPassword().length() < 3) {
//            return ResponseEntity.badRequest().body("Password must be at least 3 characters");
//        } else if(user.getPassword().length() > 30) {
//            return ResponseEntity.badRequest().body("Password is too long");
//        }
//        if(user.getEmail() == null) {
//            return ResponseEntity.badRequest().body("Email is required");
//        } else if(user.getEmail().length() < 3) {
//            return ResponseEntity.badRequest().body("Email must be at least 3 characters");
//        } else if(!Pattern.compile("^(.+)@(\\S+) $").matcher(user.getEmail()).matches()) {
//            return ResponseEntity.badRequest().body("Invalid email");
//        }

        LOG.info("Adding user: {}", user);
        return ResponseEntity.ok("User Created Successfully!");
    }
}

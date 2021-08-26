package com.mx.clabenumber;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/clabe/{number}")
public class ValidatorController {
    @GetMapping
    public ResponseEntity<String> validate(@PathVariable String number) {
        if (new ClabeNumerValidator().isClabeNumValid(number)) {
            return ResponseEntity
                    .status(OK)
                    .body("Valid");
        }
        return ResponseEntity
                .status(OK)
                .body("Invalid");

    }
}

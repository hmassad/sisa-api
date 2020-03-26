package ar.gov.msal.sisa.controller;

import ar.gov.msal.sisa.exception.NotImplementedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("refeps")
public class RefepsController {

    @GetMapping
    public ResponseEntity<Object> find() {
        throw new NotImplementedException();
    }
}

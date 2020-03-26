package ar.gov.msal.sisa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
public class NotImplementedException extends RuntimeException {

    public NotImplementedException() {
        super();
    }

    public NotImplementedException(String s) {
        super(s);
    }

    public NotImplementedException(String s, Throwable throwable) {
        super(s, throwable);
    }
}

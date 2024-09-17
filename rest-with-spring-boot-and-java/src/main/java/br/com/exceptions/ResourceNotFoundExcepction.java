package br.com.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundExcepction extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundExcepction(String ex) {
        super(ex);
    }
}

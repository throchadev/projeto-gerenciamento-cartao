package br.com.throchadev.errors;

import lombok.Data;

import java.util.List;

@Data
public class ErrorResponse {

    private final String message;
    private final int code;
    private final String status;
    //private final String objectName;
    private final List<ErrorObject> errors;
}

package com.ovi.user.payload.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
public class ApiError {

    private String message;

    private String debugMessage;

    private HttpStatus httpStatus;

    public ApiError(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}

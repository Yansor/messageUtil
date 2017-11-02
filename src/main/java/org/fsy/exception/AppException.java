package org.fsy.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by cai on 24/05/2017.
 */
@Data
@AllArgsConstructor
public class AppException extends RuntimeException{

    protected String errorCode;
    protected String errorMsg;
}

package com.bridgelabz.UserRegistrationlambda;

import com.bridgelabz.UserRegistrationlambda.ExceptionType;

public class UserRegistrationException extends Exception {
    public String message;

    public UserRegistrationException(String messege) {
        if (messege.contains("Null")) {
            this.message = ExceptionType.NULL_MESSAGE + ":" + messege;
        } else if (messege.contains("Empty")) {
            this.message = ExceptionType.EMPTY_MESSAGE + ":" + messege;
        }
    }

    @Override
    public String getMessage() {
        return message;
    }
}

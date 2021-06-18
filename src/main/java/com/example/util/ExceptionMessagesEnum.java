package com.example.util;

public enum ExceptionMessagesEnum {
    OUTCOME_NOT_FOUND("Outcome Not Found"),
    INCORRECT_REQUEST_EMPTY_ITEMS_OUTCOME("Empty item are not allowed in the outcome");

    ExceptionMessagesEnum(String msg) {
        value = msg;
    }

    private final String value;

    public String getValue(){
        return value;
    }
}

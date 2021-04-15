package org.springframework.core;

public abstract class NestedRuntimeException extends java.lang.RuntimeException {

    private static final long serialVersionUID = 5439915454935047936L;

    public NestedRuntimeException(java.lang.String msg) {
    }

    public NestedRuntimeException(java.lang.String msg, java.lang.Throwable cause) {
    }

    public java.lang.String getMessage() {
        return null;
    }

    public java.lang.Throwable getRootCause() {
        return null;
    }

    public java.lang.Throwable getMostSpecificCause() {
        return null;
    }

    public boolean contains(java.lang.Class<?> exType) {
        return false;
    }

    static {}
    {
    }
}
package com.enterpaper.exception;

/**
 * Created by Kim on 2015-07-19.
 */
public class ServiceException extends Exception{
    public ServiceException(){
        super();
    }

    public ServiceException(String message){
        super(message);
    }

    public ServiceException(String message, Throwable cause){
        super(message, cause);
    }

    public ServiceException(Throwable cause){
        super(cause);
    }
}

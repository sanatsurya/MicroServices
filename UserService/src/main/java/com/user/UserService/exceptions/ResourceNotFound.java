package com.user.UserService.exceptions;

public class ResourceNotFound extends RuntimeException{
    public ResourceNotFound(){
        super("Your Resource is not found");
    }
    public ResourceNotFound(String message){
        super(message);
    }
}

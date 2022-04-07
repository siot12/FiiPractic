package ro.fiipractic.springbootapp.controllerPost;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import ro.fiipractic.springbootapp.exception.PostNotFoundException;

public class PostNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(PostNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String employeeNotFoundHandler(PostNotFoundException exception)
    {
        return exception.getMessage();
    }
}

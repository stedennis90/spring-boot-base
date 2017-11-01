/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.example.rest;

import java.util.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest service that allow upload files.
 * @author Dennis Martinez Becerra
 */
@RestController("/")
public class Home {
    public final static Logger log = Logger.getLogger(Home.class.getName());
    
    
    @GetMapping(value = "/")
    public String home(){
        return "Welcome!!";
    }
    
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public Object test(){
        return "Test Rest Service";
    }
            
            
}

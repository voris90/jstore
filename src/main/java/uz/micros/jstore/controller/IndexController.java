package uz.micros.jstore.controller;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by java on 12.05.14.
 */

@Controller
public class IndexController {
    //@ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex() {
        return "index" ;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "hello";
    }

}

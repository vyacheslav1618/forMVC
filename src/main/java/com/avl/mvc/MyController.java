package com.avl.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/first-view")
    public String ShowFirstView() {
        return "first-view";
    }
    @RequestMapping("/second-view")
    public String ShowSecondView(){
    return "second-view";
    }

}

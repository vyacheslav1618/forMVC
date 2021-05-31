package com.avl.mvc;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    public MyController(){}
    
    @RequestMapping("/first-view")
    public String ShowFirstView() {
        return "first-view";
    }

    @RequestMapping("/second-view")
    public String ShowSecondView() {
        return "second-view";
    }

    @RequestMapping("/askWeather")
    public String askMarsWeather() {
        return "ask-mars-weather";
    }

    //add Name to Model
    @RequestMapping("/showWeather")
    public String showMarsWeather(HttpServletRequest request, Model model) {
        //method showMarsWeather gets Name of visitor
        String visitorName = request.getParameter("userName");
        //changing name
        visitorName = "Mr. " + visitorName;
        //add changed name of attribute("nameAttribute") and value for it(visitorName)
        model.addAttribute("nameAttribute", visitorName);
        return "show-mars-weather";
    }
}

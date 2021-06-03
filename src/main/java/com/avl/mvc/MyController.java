package com.avl.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    public MyController() {
    }

    @RequestMapping("/")
    public String showWelcomePage() {
        return "welcome-view";
    }

    @RequestMapping("/first-view")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/second-view")
    public String showSecondView() {
        return "second-view";
    }

    @RequestMapping("/askWeather")
    public String askMarsWeather() {
        return "ask-mars-weather";
    }

    //example of building the controller via 
    
    //add Name to Model
    @RequestMapping("/showWeather")
    public String showMarsWeather(HttpServletRequest request, Model model) {
        //method showMarsWeather gets Name of visitor
        String visitorName = request.getParameter("userName");
        //changing name
        visitorName = "Mr. " + visitorName;
        //add changed name of attribute("nameAttribute") and value for it(visitorName)
        //able to add few attributes
        model.addAttribute("nameAttribute", visitorName);
        return "show-mars-weather";
    }

    @RequestMapping("/askSeason")
    public String askMarsSeason() {
        return "ask-mars-season";
    }

    //@RequestParam annotation link a field of form ("seasonType") with
    //method's parameter String seasonType
    @RequestMapping("/showMarsSeason")
    public String showMarsSeason(@RequestParam("seasonType") String seasonType,
            Model model) {

        model.addAttribute("typeMarsSeason", seasonType);
        return "show-mars-season";
    }
}

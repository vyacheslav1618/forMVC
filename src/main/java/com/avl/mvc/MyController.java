package com.avl.mvc;

import jakarta.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mars")
/*controllerMapping*/
public class MyController {

    public MyController() {
    }

    @RequestMapping("/")/*methodMapping*/
    public String showWelcomePage() {
        return "welcome-view";
    }

    @RequestMapping("/first-view")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/ask-weather")
    public String askMarsWeather() {
        return "show-mars-weather";
    }

    //example of building the controller via 
    //add Name to Model
    @RequestMapping("/show-weather")
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

    @RequestMapping("/ask-season")
    public String askMarsSeason() {
        return "ask-mars-season";
    }

    //@RequestParam annotation link a field of form ("seasonType") with
    //method's parameter String seasonType
    @RequestMapping("/show-mars-season")
    public String showMarsSeason(@RequestParam("seasonType") String seasonType,
            Model model) {
        model.addAttribute("typeMarsSeason", seasonType);
        return "show-mars-season";
    }

    @RequestMapping("/ask-astronaut-param")
    public String askAstronautParam() {
        return "ask-astronaut-param";
    }

    @RequestMapping("/show-astronaut-param")
    public String showAstronautParam(@Valid @ModelAttribute("astronaut") Astronaut astr,
            BindingResult bindingResult) {
        //validation NAME-field
        if (bindingResult.hasErrors()) {
            return "ask-astronaut-param";
        } else {
            int salary = astr.getSalary();
            astr.setSalary(salary * 1);
            return "show-astronaut-param";
        }

    }
}

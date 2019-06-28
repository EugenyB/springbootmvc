package ua.mk.berkut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/hello")
    public ModelAndView sayHello(@RequestParam("name") String name) {
        return new ModelAndView("hello").addObject("name", name);
    }
}
package com.cmazxiaoma.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/mvc")
@Controller
public class MvcAnnotationDrivenTestController {

    @RequestMapping(value = "/testMvcAnnotationDriven", method = RequestMethod.GET)
    public ModelAndView testMvcAnnotationDriven() {
        return new ModelAndView("mvc_annotation_driven_test");
    }
}

package com.template.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Sample controller for going to the home page with a message
 */
public class HomeController extends AbstractController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("Welcome home!");
        Map model = new HashMap();
        model.put("controllerMessage", "This is the message from the controller!");
        return new ModelAndView("home", model);
    }
}

package com.template.controllers;

import com.template.model.user.User;
import com.template.service.standard.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Sample controller for going to the home page with a message
 */
public class AddUserController extends AbstractController {

    private static final Logger logger = LoggerFactory.getLogger(AddUserController.class);

    private UserService userService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("Add user!");
        String username = ServletRequestUtils.getStringParameter(request, "username");
        String password = ServletRequestUtils.getStringParameter(request, "password");
        User user = new User(username, password);
        userService.addUser(user);

        List<User> users = userService.loadUsers();
        Map model = new HashMap();
        model.put("users", users);
        return new ModelAndView("userlist", model);
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}

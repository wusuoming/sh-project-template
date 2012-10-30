package com.template.controllers;

import com.template.dto.UserDTO;
import com.template.service.standard.UserService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-10-28
 * Time: 下午11:10
 */
public class UserOverviewController extends AbstractController {
    private UserService userService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<UserDTO> users = userService.loadUserDTOs();
        return new ModelAndView("userOverview", "users", users);
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}

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
 * Date: 12-11-5
 * Time: 下午9:54
 */
public class BackendAuthenticationSuccessController extends AbstractController {
    private UserService userService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<UserDTO> userDTOs = userService.loadUserDTOs();

        return new ModelAndView("login/backendLoginSuccess", "userDTOs", userDTOs);
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}

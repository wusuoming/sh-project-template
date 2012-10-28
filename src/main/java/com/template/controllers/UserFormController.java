package com.template.controllers;

import com.template.dto.UserDTO;
import com.template.service.standard.UserService;
import org.hsqldb.lib.StringUtil;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-10-28
 * Time: 下午12:40
 */
public class UserFormController extends SimpleFormController {
    private UserService userService;

    public UserFormController() {
        setCommandClass(UserDTO.class);
        setCommandName("userDTO");
        setFormView("views/userForm");
    }

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        String userGuid = ServletRequestUtils.getStringParameter(request, "userGuid");
        if (StringUtils.hasText(userGuid)) {
            return userService.loadUserByGuid(userGuid);
        }
        return new UserDTO();
    }

    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        UserDTO userDTO = (UserDTO) command;
        userService.saveOrUpdateUserDTO(userDTO);
        return new ModelAndView("redirect:/user/overview");
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}

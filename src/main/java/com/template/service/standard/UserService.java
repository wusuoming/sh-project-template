package com.template.service.standard;

import com.template.dto.UserDTO;
import com.template.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 7/6/11
 * Time: 3:24 PM
 */
public interface UserService extends UserDetailsService{

    void addUser(User user);

    List<User> loadUsers();

    User loadUserByGuid(String userGuid);

    void saveOrUpdateUserDTO(UserDTO userDTO);

    List<UserDTO> loadUserDTOs();
}

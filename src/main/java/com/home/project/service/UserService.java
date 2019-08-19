package com.home.project.service;

import com.home.project.model.user.User;
import com.home.project.model.user.dto.UserDTO;

public interface UserService {

    User createUser(final UserDTO userDTO);

    void deleteUser(final UserDTO userDTO);
}

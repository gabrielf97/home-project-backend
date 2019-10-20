package com.home.project.service;

import com.home.project.model.user.User;
import com.home.project.model.user.dto.UserDTO;

public interface UserService {

    User create(final UserDTO userDTO);

    void delete(final UserDTO userDTO);
}

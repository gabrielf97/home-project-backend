package com.home.project.service.impl;

import com.home.project.exception.UserCreateException;
import com.home.project.model.user.User;
import com.home.project.model.user.dto.UserDTO;
import com.home.project.repository.UserRepository;
import com.home.project.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User create(final UserDTO userDTO) {
        try {
            User user = userRepository.save(userDTO.toUser());
            log.info("M=create, usuario criado com sucesso");
            return user;
        }catch (Exception e){
            throw new UserCreateException();
        }
    }

    @Override
    public void delete(final UserDTO userDTO) {
        try{
            var user = userRepository.findByUserName(userDTO.getUserName());
            user.setActive(Boolean.FALSE);
            userRepository.save(user);
        }catch (Exception e) {
            log.error("M=delete, error ao excluir usuario={}", userDTO);
        }
        log.info("M=delete, usuario excluido com sucesso");
    }
}

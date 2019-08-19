package com.home.project.service;

import com.home.project.model.user.User;
import com.home.project.model.user.dto.UserDTO;
import com.home.project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(final UserDTO userDTO) {
        try {
            User user = userRepository.save(userDTO.toUser());
            log.info("M=createUser, usuario criado com sucesso");
            return user;
        }catch (Exception e){
            log.error("M=createUser, error ao criar usuario={}", userDTO);
        }
        return null;
    }

    @Override
    public void deleteUser(UserDTO userDTO) {
        try{
            var user = userRepository.findByUserName(userDTO.getUserName());
            user.setActive(Boolean.FALSE);
            userRepository.save(user);
        }catch (Exception e) {
            log.error("M=deleteUser, error ao excluir usuario={}", userDTO);
        }
        log.info("M=deleteUser, usuario excluído com sucesso");
    }
}

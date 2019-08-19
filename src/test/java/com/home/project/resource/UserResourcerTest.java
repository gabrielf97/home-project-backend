package com.home.project.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.home.project.HomeProjectApplicationTests;
import com.home.project.model.user.dto.UserDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class UserResourcerTest extends HomeProjectApplicationTests {

    @Autowired
    private MockMvc mvc;

    @Test
    @DisplayName("Deve criar usuário")
    public void createUserTest() throws Exception {

        UserDTO userDTO = UserDTO.builder()
                .userName("gabrielf")
                .build();

        mvc.perform(post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(userDTO)))
                .andExpect(status().isCreated());
    }

    @Test
    @DisplayName("Deve deletar usuário")
    public void deleteUserTest() throws Exception {

        UserDTO userDTO = UserDTO.builder()
                .userName("gabrielf")
                .build();

        mvc.perform(delete("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(userDTO)))
                .andExpect(status().isOk());
    }

    public static String asJsonString(final Object obj) {
        try {
            final var mapper = new ObjectMapper();
            final var jsonContent = mapper.writeValueAsString(obj);
            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

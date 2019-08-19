package com.home.project;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
		webEnvironment = SpringBootTest.WebEnvironment.MOCK,
		classes = HomeProjectApplication.class)
@AutoConfigureMockMvc
public class HomeProjectApplicationTests {
}
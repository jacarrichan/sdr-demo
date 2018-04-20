package com.jacarrichan.demo.sdr;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles(profiles = "test")
public class SpringBootApplicationTests {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        System.setProperty("spring.profiles.active", "test");
        app.run(args);
    }
}

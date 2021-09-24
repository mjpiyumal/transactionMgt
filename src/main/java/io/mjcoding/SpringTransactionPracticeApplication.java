package io.mjcoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringTransactionPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTransactionPracticeApplication.class, args);
    }

}

package br.com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration
@ComponentScan("br.com.app")
@EnableJpaRepositories("br.com.app.persistence.repositories")
@EntityScan("br.com.app.persistence.entities")
@EnableTransactionManagement
public class AppStart {

    /**
     * Starts spring boot application
     * @param args args from user
     */
    public static void main(String[] args) {
         SpringApplication.run(AppStart.class, args);
    }

}

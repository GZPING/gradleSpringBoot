package com.petter.gradlespringboot;

import com.petter.gradlespringboot.service.Person;
import com.petter.gradlespringboot.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Field;

/**
 * @author GD
 */
@SpringBootApplication
public class GradleSpringBootApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(GradleSpringBootApplication.class, args);
        User user = (User) context.getBean("user");
        System.out.println(user);
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }

    @RequestMapping("/index")
    public String index(){


        return "this is a index page result !" ;

    }



}

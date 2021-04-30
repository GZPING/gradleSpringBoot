package com.petter.gradlespringboot.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : GD
 * @date :2021/4/29 : 9:49
 */
@Data
@Component
@ConfigurationProperties(prefix = "user")
public class User {

    public User(Person person, List<String> girlFriend) {
        this.person = person;
        this.girlFriend = girlFriend;
    }

    private String name;

    private String age;

    private Person person;

    private List<String> girlFriend;
}

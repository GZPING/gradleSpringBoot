package com.petter.gradlespringboot.service;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author : GD
 * @date :2021/4/29 : 9:49
 */
@Data
@Component
@ConfigurationProperties("person")
public class Person {

    private String name;

    private String number;

}

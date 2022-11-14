package me.yoonhc.springbootstudy.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("admin")
public class HongChanProperties {

    private String fullName;

    private String name;

    private int age;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
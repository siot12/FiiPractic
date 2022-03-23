package com.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.beans.BeanProperty;

@Configuration
public class ApplicationConfig {

    @Bean(name = "engineBean")
    @Scope("prototype")
    public Engine getEngine()
    {
        return new Engine();
    }
    @Bean(name = "carBean")
    public Car getCar()
    {
        return new Car();
    }
}

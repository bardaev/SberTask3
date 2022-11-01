package com.sber.task3.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperComponent {

    @Bean
    public ModelMapper mapper() {
        return new ModelMapper();
    }
}

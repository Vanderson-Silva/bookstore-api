package com.vssystem.bookstore.config;

import com.vssystem.bookstore.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TesteConfig {
    @Autowired
    private DBService dbService;

    @Bean
    public void instanciaBaseDados() {
        this.dbService.instanciaBadeDados();
    }
}

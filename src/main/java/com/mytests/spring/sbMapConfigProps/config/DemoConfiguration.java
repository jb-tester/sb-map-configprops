package com.mytests.spring.sbMapConfigProps.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DemoProperties.class)
public class DemoConfiguration {
    private final DemoProperties demoProperties;

    DemoConfiguration(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }
}

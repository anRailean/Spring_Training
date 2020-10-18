package ru.anatolie.configurator;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.anatolie.configurator")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}

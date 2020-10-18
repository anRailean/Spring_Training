package ru.anatolie.configurator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringConfigurator {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            SpringConfig.class);

}

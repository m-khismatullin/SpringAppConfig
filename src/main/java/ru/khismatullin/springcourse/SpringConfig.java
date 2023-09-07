package ru.khismatullin.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.khismatullin.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}

package com.rushi.rasal.SpringAopDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.rushi.rasal")
@EnableAspectJAutoProxy
public class AppConfig {
	
}

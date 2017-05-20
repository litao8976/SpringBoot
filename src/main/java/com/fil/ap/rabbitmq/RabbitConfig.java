package com.fil.ap.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue HelloQueue() {
    	
        return new Queue("hello");
    }

    @Bean
    public Queue UserQueue() {
    	
        return new Queue("userpasswordQueue");
    }
}
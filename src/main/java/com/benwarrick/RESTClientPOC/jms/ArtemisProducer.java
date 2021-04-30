package com.benwarrick.RESTClientPOC.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@EnableAutoConfiguration
public class ArtemisProducer {
        @Autowired
        JmsTemplate jmsTemplate;

        @Value("test2.topic")
        String destinationQueue;

        public void send(String msg){
                jmsTemplate.convertAndSend(destinationQueue, msg);
        }
}

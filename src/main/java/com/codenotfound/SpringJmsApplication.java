package com.codenotfound;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.JmsException;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class SpringJmsApplication {

  public static void main(String[] args) throws Exception, JmsException {
//	ApplicationContext ctx = 
			SpringApplication.run(SpringJmsApplication.class, args);
//	JmsTemplate jms = ctx.getBean(JmsTemplate.class);
//	jms.convertAndSend("java", "test message");
 	
}
  
}

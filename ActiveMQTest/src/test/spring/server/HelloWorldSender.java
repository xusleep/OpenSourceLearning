package test.spring.server;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class HelloWorldSender {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("MQ/springmq.xml");
		JmsTemplate jmsTemplate = (JmsTemplate)context.getBean("myJmsTemplate");
		Destination destination = (Destination)context.getBean("destination");
		for(int i = 0; i < 100; i++)
		{
			jmsTemplate.send(destination, new MessageCreator(){
				public Message createMessage(Session session) throws JMSException{
					return session.createTextMessage("this is a test sdf !");
				}
			});
		}
	}

}

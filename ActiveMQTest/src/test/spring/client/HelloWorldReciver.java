package test.spring.client;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class HelloWorldReciver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("MQ/springclientmq.xml");
		//JmsTemplate jmsTemplate = (JmsTemplate)context.getBean("myJmsTemplate");
		//Destination destination = (Destination)context.getBean("destination");
		//TextMessage msg = (TextMessage)jmsTemplate.receive(destination);
		//try {
		//	System.out.println("received message is : " + msg.getText());
		//} catch (JMSException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
	}

}

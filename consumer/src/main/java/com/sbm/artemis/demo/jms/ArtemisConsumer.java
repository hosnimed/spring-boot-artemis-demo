package com.sbm.artemis.demo.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.listener.adapter.MessageListenerAdapter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.stereotype.Component;

@Component
public class ArtemisConsumer { //  implements MessageConverter {


	@JmsListener(destination = "${jms.queue.destination}")
	public void receive(Message message){
		if(message.getPayload() instanceof String){
			System.out.println("Recieved Message: " + message.getPayload().toString());
		}else if (message.getPayload() instanceof Person){
			System.out.println("Recieved Person: " + message.getPayload().toString());
		}else {
			System.err.println("Message Type Unkown !");
		}
	}

/*

	@Override
	public Object fromMessage(Message<?> message, Class<?> targetClass) {
		System.out.println("from Message.getPayload() = " + message.getPayload().toString());
		return  message;
	}

	@Override
	public Message<?> toMessage(Object payload, MessageHeaders headers) {
		System.out.println("to Message.getPayload() = " + payload.toString());
		return (Message<Person>) ( payload );
	}

*/

}
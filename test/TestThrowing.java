import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day2.service.UserService;

class TestThrowing {

	@Test
	void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext3.xml");
		UserService us = (UserService) ctx.getBean("userService");
		
	}

}

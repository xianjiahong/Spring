import static org.junit.jupiter.api.Assertions.*;

import org.aspectj.apache.bcel.util.ClassPath;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.pojo.User;
import aop.service.UserService;

class TestAop {

	@Test
	void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		UserService us = (UserService) ctx.getBean("userService");
		User user = new User(1,"уехЩ",18);
		us.saveUser(user);
		
	}

}

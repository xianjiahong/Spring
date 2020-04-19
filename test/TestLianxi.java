import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.pojo.User;

class TestLianxi {

	@Test
	void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext4.xml");
		Lianxi lianxi = (Lianxi)ctx.getBean("lianxi");
		System.out.println(lianxi.toString());
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestEntity {

	@Test
	void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext();
		TestEntity test = (TestEntity) ctx.getBean("entity");
		test.test();
	}

}

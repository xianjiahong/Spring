import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestSpring {

	@Test
	void test() {
		//1、通过Spring的配置文件来创建一个对象
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.通过applicationContext对象的方法去获取配置文件中的bean
		SpringTest test=(SpringTest) ctx.getBean("test");
		//3，调用这个对象的方法来实现输出
		test.print();
	}
	@Test
	void test1() {
		//1、通过Spring的配置文件来创建一个对象
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.通过applicationContext对象的方法去获取配置文件中的bean
		Test1 test1=(Test1) ctx.getBean("test1");
		//3，调用这个对象的方法来实现输出
		test1.print();
	}
}
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestSpring {

	@Test
	void test() {
		//1��ͨ��Spring�������ļ�������һ������
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.ͨ��applicationContext����ķ���ȥ��ȡ�����ļ��е�bean
		SpringTest test=(SpringTest) ctx.getBean("test");
		//3�������������ķ�����ʵ�����
		test.print();
	}
	@Test
	void test1() {
		//1��ͨ��Spring�������ļ�������һ������
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.ͨ��applicationContext����ķ���ȥ��ȡ�����ļ��е�bean
		Test1 test1=(Test1) ctx.getBean("test1");
		//3�������������ķ�����ʵ�����
		test1.print();
	}
}
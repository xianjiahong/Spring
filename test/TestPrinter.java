import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import print.Printer;

class TestPrinter {

	@Test
	void test() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext1.xml");
		Printer p = (Printer) ctx.getBean("printer");
		p.print();
		
	}

}

package day2.boost;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class AfterLogger {
	private Logger log = Logger.getLogger(AfterLogger.class);
	
	public void afterLog(JoinPoint jp) {
		System.out.println("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法结束");
	}
}

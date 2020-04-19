package day2.boost;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class AfterLogger {
	private Logger log = Logger.getLogger(AfterLogger.class);
	
	public void afterLog(JoinPoint jp) {
		System.out.println("����"+jp.getTarget()+"��"+jp.getSignature().getName()+"��������");
	}
}

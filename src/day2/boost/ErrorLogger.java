package day2.boost;
/**
 * �쳣��ǿ��������
 * @author ASUS
 * @����ʱ�� 2020��4��17������3:27:33
 */

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class ErrorLogger {
	private Logger log = Logger.getLogger(ErrorLogger.class);
	
	public void aterThrowing(JoinPoint jp,RuntimeException e) {
		log.info("����"+jp.getTarget()+"��"+jp.getSignature().getName()+"���������쳣");
	}
	
}

package aop.pojo;
/**
 * 
 * @author ASUS
 * @����ʱ�� 2020��4��14������4:01:45
 */
public class User {
	private int uno;
	private String uname;
	private int age;
	
	public int getuNo() {
		return uno;
	}
	public void setuNo(int uNo) {
		this.uno = uNo;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(int uno, String uname, int age) {
		super();
		this.uno = uno;
		this.uname = uname;
		this.age = age;
	}
	
}

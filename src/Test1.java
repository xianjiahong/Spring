/**
 * 
 * @author ASUS
 * @创建时间 2020年4月14日上午10:31:16
 */
public class Test1 {
	private String name;
	private String content;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void print() {
		System.out.println(name+"说: " +content);
	}
}

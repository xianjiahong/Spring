
public class Lianxi {
 private String name;
 private String context;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContext() {
	return context;
}
public void setContext(String context) {
	this.context = context;
}
public Lianxi(String name, String context) {
	super();
	this.name = name;
	this.context = context;
}
	@Override
	public String toString() {
		return "Lianxi [name=" + name + ", context=" + context + "]";
	}
	 
}

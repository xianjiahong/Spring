package 静态代理;
/**
 * 
 * @author ASUS
 * @创建时间 2020年4月14日下午3:12:52
 */
public class ProxyLand {
	private Landlady land;
	
	public void tenement() {
		if(land == null) {
			land = new Landlady();
		}
		Intermediary.before();
		land.tenement();
		Intermediary.after();
	}

}

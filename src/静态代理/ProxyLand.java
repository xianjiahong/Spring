package ��̬����;
/**
 * 
 * @author ASUS
 * @����ʱ�� 2020��4��14������3:12:52
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

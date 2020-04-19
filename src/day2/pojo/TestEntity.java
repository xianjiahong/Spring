package day2.pojo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestEntity implements Serializable {
	private String specialCharacter1; // �����ַ�ֵ1
	private String specialCharacter2; // �����ַ�ֵ2
	private User innerBean; // JavaBean����
	private List<String> list; // List����
	private String[] array; // ��������
	private Set<String> set; // Set����
	private Map<String, String> map; // Map����
	private Properties props; // Properties����
	private String emptyValue; // ע����ַ���ֵ
	private String nullValue = "init value"; // ע��nullֵ
	
	public void setSpecialCharacter1(String specialCharacter1) {
		this.specialCharacter1 = specialCharacter1;
	}

	public void setSpecialCharacter2(String specialCharacter2) {
		this.specialCharacter2 = specialCharacter2;
	}

	public void setInnerBean(User innerBean) {
		this.innerBean = innerBean;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public void setEmptyValue(String emptyValue) {
		this.emptyValue = emptyValue;
	}

	public void setNullValue(String nullValue) {
		this.nullValue = nullValue;
	}

	public void showValue() {
		System.out.println("�����ַ�1��" + this.specialCharacter1);
		System.out.println("�����ַ�2��" + this.specialCharacter2);
		System.out.println("�ڲ�Bean��" + this.innerBean.getName());
		System.out.println("List���ԣ�" + this.list);
		System.out.println("��������[0]��" + this.array[0]);
		System.out.println("Set���ԣ�" + this.set);
		System.out.println("Map���ԣ�" + this.map);
		System.out.println("Properties���ԣ�" + this.props);
		System.out.println("ע����ַ�����[" + this.emptyValue + "]");
		System.out.println("ע��nullֵ��" + this.nullValue);
	}


}

package mc.sn.day4;

public class DataClass {
	public DataClass() {}
	public DataClass(String sex) {
		this.sex = sex;
	}
	//VO(Value Object)��� �մϴ�.
	//DTO(Data Transfer Object)��� �θ��⵵ �մϴ�.
	private String name;
	private String sex;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	private void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return this.sex;
	}
	
}

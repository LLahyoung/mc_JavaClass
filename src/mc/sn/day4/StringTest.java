package mc.sn.day4;

public class StringTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test1�� ȣ���ϴ� �ڵ带 �ۼ��Ͻÿ�.
		StringTest st = new StringTest();
		st.test3();
	}
	public void test3() {
		DataClass dc1 = new DataClass("female");
		DataClass dc2 = new DataClass("male");
		dc1.setName("kim");
		dc2.setName("lee");
		//dc1.setSex("male");
		System.out.println(dc1.getName()+","+dc1.getSex());
		System.out.println(dc2.getName()+","+dc2.getSex());
	}
	public void test2() {
		DataClass dc1 = new DataClass();
		DataClass dc2 = new DataClass();
//		dc1.name = "kim";
//		dc1.sex = "male";
//		dc2.name = "lee";
//		dc2.sex = "female";
//		System.out.println(dc1.name+","+dc1.sex);
//		System.out.println(dc2.name+","+dc2.sex);
	}
	public void test1() {
		String name = "kim";
		String addr = "�����";
		System.out.println(name+","+addr);
		String n = new String("kim"); //������ --> �� �ʿ�� �ϴ� ������ �ʱ�ȭ�ϴ� ����
		System.out.println("n= "+n);
	}
}

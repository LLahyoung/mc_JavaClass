package mc.sn.day8;

public class ReviewWeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewWeek2 instance = new ReviewWeek2();

		// 2. �Ʒ��� test1() ȣ�⿡ ���ؼ� ���� ����ó���ϴ� �ڵ� - try catch
		try {
			instance.test1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		instance.test2();
		
		instance.test4();
	}

	// throws - try catch ����ó��
	public void test1() throws ArrayIndexOutOfBoundsException {
		int[] a = new int[0];
		System.out.println(a[0]);

		// 1. exception�� ���߿� ó���ϵ��� �޼ҵ带 ���� - throws
	}

	// ���� ������
	public void test2() {
		// 31�� ������ ��µǸ� � ���� ����ұ��?
		// 32�� ������ ��µǸ� � ���� ����ұ��?
		int x = 10;
		System.out.println("x++ = " + x++);
		System.out.println("x = " + x);
	}

	//�����ε� - �Ķ���� ������ �ٸ��ų� Ÿ���� �ٸ��ų�
	public void test3() {}
	public void test3(int a) {}
	public void test3(String b) {}
	
	//���� for�� 
	public void test4() {
		int[] numbers = {1,2,3};
		//1. �ε��� ���� �迭�� ������ ����ϴ� �ڵ� �ۼ�
		for(int temp: numbers) {
			System.out.println(temp);
		}
	}
}

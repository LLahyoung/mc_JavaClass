package mc.sn.day3;

public class ServiceExample {
	
	public void displayGugudan() {
		for (int k=0;k<8;k++) {
			int dan = k+2;
			for (int i=0;i<9;i++) {
				int number = i+1;
				System.out.println(dan+"X"+number+"="+(dan*number));
			}
			System.out.println();
		}
	}
	public void displayMonth() {
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");

		int day = 0;
		int lastDay = 31;
		int space = 0;

		for (int i = 0; i < lastDay; i++) {
			day = i + 1;
			System.out.print(day + "\t");
			if ((space + day) % 7 == 0) {
				System.out.println();
			}
		}
	}
}

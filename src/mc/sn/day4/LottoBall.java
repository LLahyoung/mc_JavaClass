package mc.sn.day4;

public class LottoBall {
	// ������ Ŭ����
	private String ballNumber;
	private boolean isSelectedBall;
	
	// �� �ν��Ͻ��� ����ϱ� ���� �ʿ��� �޼ҵ�� �����ڸ� �����Ͻÿ�.
	// �ʵ��� set,get�� ���� �� ��Ʈ�� ����ÿ�.
	// �����ڵ� ����ÿ�.
	public LottoBall(String ballNumber) {
		this.ballNumber = ballNumber;
		
	}
	public String getBallNumber() {
		
		return this.ballNumber;
	}
	
	public boolean getSelectedBall() {
		return this.isSelectedBall;
	}
	
//	public void setBallNumber(String ballNumber) {
//		this.ballNumber = ballNumber;
//	}
	public void setSelectedBall(boolean isSelectedBall) {
		this.isSelectedBall = isSelectedBall;
	}
}

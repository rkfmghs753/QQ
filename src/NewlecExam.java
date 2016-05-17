import oop.inhe.is.Exam;

public class NewlecExam extends Exam {

	private int com;

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}

	public NewlecExam() {
		// TODO Auto-generated constructor stub
	}

	public int total() {
		return super.total() + com;
	}

	public float avg() {
		return total() / 4.0f;
	}
}

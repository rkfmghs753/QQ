import java.util.Scanner;

import oop.inhe.is.ExamConsole;

public class NewlecExamConsole extends ExamConsole {

	private NewlecExam exam;

	public NewlecExamConsole() {
		super(new NewlecExam());  //å1��294������ ����,305������ ����
		exam = (NewlecExam) getExam();
	}

	@Override
	public void inputGrade() {
		Scanner scan = new Scanner(System.in);
		super.inputGrade();

		System.out.print(" ����:");
		int c = scan.nextInt();
		while (c > 100 || c < 0) {
			System.out.println("����� �Է��ϼ���(0~100)");
			System.out.print(" ����:");
			c = scan.nextInt();
		}
		exam.setCom(c);

	}

	@Override
	protected void onPrint() {
		System.out.printf("   ���� : %d\n", exam.getCom());
	}
}

// �ڽĺθ�뤷�ӹ����� �⺻�������ڻ���ϴµ� �����ε��뼭 �ȴ�
// �̱����ֿܼ��⺻������ ���
// �������� �ȴ�´� �θ𿡼� �⺻������ �߰����ִ��� �ڽ����� �����ε�
// �Ѱ� ����� ���ϴ���
import java.util.Scanner;

import oop.inhe.is.ExamConsole;

public class NewlecExamConsole extends ExamConsole {

	private NewlecExam exam;

	public NewlecExamConsole() {
		super(new NewlecExam());  //책1권294페잉지 밑쥴,305페이지 밑쥴
		exam = (NewlecExam) getExam();
	}

	@Override
	public void inputGrade() {
		Scanner scan = new Scanner(System.in);
		super.inputGrade();

		System.out.print(" 컴터:");
		int c = scan.nextInt();
		while (c > 100 || c < 0) {
			System.out.println("제대로 입력하세욤(0~100)");
			System.out.print(" 컴터:");
			c = scan.nextInt();
		}
		exam.setCom(c);

	}

	@Override
	protected void onPrint() {
		System.out.printf("   컴터 : %d\n", exam.getCom());
	}
}

// 자식부모삳ㅇ속받을때 기본생ㄷ성자사용하는뎅 오버로딩대서 안댐
// 이그젬콘솔에기본생성쟈가 없어서
// 뉴렉에서 안대는댕 부모에서 기본생성자 추가해주던가 자식한테 오버로드
// 한거 쓰라고 말하던가
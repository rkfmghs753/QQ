
import oop.inhe.is.ExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(ExamLib.total(2, 4, 6));

		ExamConsole console = new NewlecExamConsole();

		// �������ΰɷ� ���� �ϼ�
		console.inputGrade();
		console.print();

		// NewlecExam exam = new NewlecExam(1,1,1,1);
		// System.out.println(exam.total());
		// System.out.println(exam.avg());

	}

}
//
// NewlecExam exam = new NewlecExam(1,1,1,1);
// System.out.println(exam.total()); = > 4 ����
// Exam exam = new NewlecExam(1,1,1,1);
// System.out.println(exam.total()); = >�굵! 4 ����

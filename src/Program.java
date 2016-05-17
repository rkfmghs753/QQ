
import oop.inhe.is.ExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(ExamLib.total(2, 4, 6));

		ExamConsole console = new NewlecExamConsole();

		// ¹ü¿ëÀûÀÎ°É·Î ÂüÁÒ ÇÏ¼À
		console.inputGrade();
		console.print();

		// NewlecExam exam = new NewlecExam(1,1,1,1);
		// System.out.println(exam.total());
		// System.out.println(exam.avg());

	}

}
//
// NewlecExam exam = new NewlecExam(1,1,1,1);
// System.out.println(exam.total()); = > 4 ³ª¿È
// Exam exam = new NewlecExam(1,1,1,1);
// System.out.println(exam.total()); = >¾êµµ! 4 ³ª¿È

package ybm;

import oop.inhe.ya.AvgListener;
import oop.inhe.ya.Exam;
import oop.inhe.ya.ExamConsole;

public class Program {

	public static void main(String[] args) {
		// YBM��Ű�����ִ� Program �Դϴ�

		YBMExam exam = new YBMExam();	
		
		
		exam.setAvgListener(new AvgListener(){
			//�ѹ濡 �ϴ¹��!!
			@Override
			public float avg() {		
			
				return exam.total() / 4.0f;
			}
		});
			
		
		
//		AvgListener a = new AvgListener(){
//			//�̸����¾� ���� �ѹ���԰� ���� ��ü�� �����
//			@Override
//			public float avg() {		
//			
//				return exam.total() / 4.0f;
//			}
//		};
//		exam.setAvgListener(a);
//			
		
		
//		class YBMAvgListener implements AvgListener {
//		// ��� �����ϴ� �뵵�� �Լ��ȿ����� �ӽ÷� �����Ϸ��� ����ٰ� ��������!
//		// public ����ȵ�
//			@Override
//			public float avg() {		
//			
//				return exam.total() / 4.0f;
//			}
//		}
//		exam.setAvgListener(new YBMAvgListener());
                               		

		// ExamConsole console = new ExamConsole(exam);
		//
		// console.setPrintListener(new YBMPrintListener());
		// // ��žȾ��� �߰�������Ʈ ���� �ʿ��ϸ� ����
		//
		// console.setTitlePrintListener(new YBMTitlePrintListener());
		// //��� ���ϸ� �⺻���� ������� ������ ���ָ� YBM����� ����
		//
		// console.inputGrade();
		// console.print();
		//
	}

}

package ybm;

import oop.inhe.ya.ExamConsole;
import oop.inhe.ya.TitlePrintListener;

public class YBMExamConsole extends ExamConsole implements TitlePrintListener{

	
	public YBMExamConsole(){
		super(new YBMExam());
		exam.setAvgListener();
	}
	
	
	@Override
	public void onTitlePrint() {
		
		System.out.println("����������������������������");
		System.out.println("��     YBM�����      ��");
		System.out.println("����������������������������");
	}

}

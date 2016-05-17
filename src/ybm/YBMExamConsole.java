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
		
		System.out.println("忙式式式式式式式式式式式式忖");
		System.out.println("弛     YBM緒塭嫘      弛");
		System.out.println("戌式式式式式式式式式式式式戎");
	}

}

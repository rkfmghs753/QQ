package ybm;

import oop.inhe.ya.AvgListener;
import oop.inhe.ya.Exam;
import oop.inhe.ya.ExamConsole;

public class Program {

	public static void main(String[] args) {
		// YBM패키지에있는 Program 입니당

		YBMExam exam = new YBMExam();	
		
		
		exam.setAvgListener(new AvgListener(){
			//한방에 하는방법!!
			@Override
			public float avg() {		
			
				return exam.total() / 4.0f;
			}
		});
			
		
		
//		AvgListener a = new AvgListener(){
//			//이름없는애 만들어서 한번써먹고 마는 객체를 만든당
//			@Override
//			public float avg() {		
//			
//				return exam.total() / 4.0f;
//			}
//		};
//		exam.setAvgListener(a);
//			
		
		
//		class YBMAvgListener implements AvgListener {
//		// 잠깐 구현하는 용도로 함수안에서만 임시로 쓰게하려고 여기다가 끼워넣음!
//		// public 쓰면안돼
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
		// // 요거안쓰면 중간에프린트 ㄴㄴ 필요하면 쓰셈
		//
		// console.setTitlePrintListener(new YBMTitlePrintListener());
		// //요거 안하면 기본값인 성적출력 나오고 써주면 YBM빠라밤 나옴
		//
		// console.inputGrade();
		// console.print();
		//
	}

}

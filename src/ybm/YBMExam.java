package ybm;

import oop.inhe.ya.AvgListener;
import oop.inhe.ya.Exam;

public class YBMExam extends Exam {

	@Override
	public int total() {
		// total 오버라이드~~~
		return super.total()+toeic;
	}

//	public class YBMAvgListener implements AvgListener {
//
//		@Override
//		public float avg() {
//			// 얘는 인터페이스 함수 구현한거!
//			toeic = 0;
//			return total() / 4.0f;
//		}
//	}

	
	private int toeic;

	public int getToeic() {
		return toeic;
	}

	public void setToeic(int toeic) {
		this.toeic = toeic;
	}

}

package boxing;

public class Program {
	public static void add(Integer x){
		x++;
	}
	public static void main(String[] args) {		
		
		Integer x = new Integer(3);
		add(x);
		System.out.println(x);
		
		
		
//		Integer x = 3 ; // x는 참조변수! 3을 담을수가 없다! boxing된것임!
		// int y = 4 ; //얘는 기본자료형
		// Integer z = x+y ;
		// //박스에서 x의 값을 꺼내줘야한다! 그게 Unboxing!
		// //원래 연산이 잘못된거지만 자동으로 언박싱 해주기때문에가능하다!
		//
		// System.out.println(z); // 7이 잘 출력된다>0<
		//
		
		
		
//		Object obj = new Integer(3);
//		//요렇게해준당
		
	}

}

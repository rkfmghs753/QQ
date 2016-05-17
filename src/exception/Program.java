package exception;

import exceptionlib.Calculator;
import exceptionlib.범위를벗어난예외오류;
import exceptionlib.영으로나눈예외오류;

public class Program {

	public static void printValue(int x, int y) throws 영으로나눈예외오류, 범위를벗어난예외오류 {

		int z = Calculator.div(x, y);
		System.out.println(z);
	}

	public static void main(String[] args) {
		// 예외처리~배운다~
		try {
			printValue(1220, 4);
		} catch(영으로나눈예외오류 e) {

			System.out.println("야 분모에 0 쥬면 어캄ㅋ다시해");
		}
		catch ( Exception e){
			e.printStackTrace();
		
		
		}
		finally{
			//모든 catch문에서 공통적으로 해야되는것 여기다가 구현
			System.out.println("자원놓아주긔");
		}
		
		// catch (범위를벗어난예외오류 e) {
		//
		// System.out.println("야 0~100사이에서 ㄱㄱ");
		// }
		System.out.println("dd");

		// Scanner scan = new Scanner(System.in);
		// scan.nextInt();
	}

}

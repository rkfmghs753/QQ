package exception;

import exceptionlib.Calculator;
import exceptionlib.������������ܿ���;
import exceptionlib.�����γ������ܿ���;

public class Program {

	public static void printValue(int x, int y) throws �����γ������ܿ���, ������������ܿ��� {

		int z = Calculator.div(x, y);
		System.out.println(z);
	}

	public static void main(String[] args) {
		// ����ó��~����~
		try {
			printValue(1220, 4);
		} catch(�����γ������ܿ��� e) {

			System.out.println("�� �и� 0 ��� ��į���ٽ���");
		}
		catch ( Exception e){
			e.printStackTrace();
		
		
		}
		finally{
			//��� catch������ ���������� �ؾߵǴ°� ����ٰ� ����
			System.out.println("�ڿ������ֱ�");
		}
		
		// catch (������������ܿ��� e) {
		//
		// System.out.println("�� 0~100���̿��� ����");
		// }
		System.out.println("dd");

		// Scanner scan = new Scanner(System.in);
		// scan.nextInt();
	}

}

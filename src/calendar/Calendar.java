package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// �޷� ����ϱ�!
		Scanner scan = new Scanner(System.in);

		int year ;
		int month;

		System.out.print("  �⵵ �Է�:");

		year = scan.nextInt();

		System.out.print("  �� �Է�: ");

		month = scan.nextInt();

		try {
			Calendar2 cal = new Calendar2(year, month);

			// ���
			cal.printCal(year,month);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}

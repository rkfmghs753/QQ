package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// 달력 출력하기!
		Scanner scan = new Scanner(System.in);

		int year ;
		int month;

		System.out.print("  년도 입력:");

		year = scan.nextInt();

		System.out.print("  월 입력: ");

		month = scan.nextInt();

		try {
			Calendar2 cal = new Calendar2(year, month);

			// 출력
			cal.printCal(year,month);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}

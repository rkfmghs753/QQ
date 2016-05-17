package calendar;

import java.util.Calendar;

public class Calendar2 {

	// Calendar �ν��Ͻ�����
	Calendar cal = Calendar.getInstance();

	// ���� ǥ�� ���
	private String[] day = { "��", "��", "ȭ", "��", "��", "��", "��" };
	// ��¥ ������ �迭
	private String[][] date = new String[6][7];

	private int wid = day.length; // �迭 ���γ���
	private int startDay; // �� ����
	private int lastDay; // �� ������
	private int inputDate = 1; // �Է³�¥

	// ������
	public Calendar2(int year, int month) throws Exception {
		if (month < 1 || month > 12) {
			System.out.println("1�� 12������ ���ڸ� �Է��ϼ���");
			throw new Exception();
		} else {
			cal.set(Calendar.YEAR, year);
			cal.set(Calendar.MONTH, month - 1); // ����-1?
			cal.set(Calendar.DATE, 1);

			startDay = cal.get(Calendar.DAY_OF_WEEK); // �����ۿ���?
			lastDay = cal.getActualMaximum(Calendar.DATE); // ��������

			// 2���迭�� ��¥�Է�!
			int row = 0;
			for (int i = 1; inputDate <= lastDay; i++) {
				// ���ۿ����� ���������� ������ �־��!!
				if (i < startDay)
					date[row][i - 1] = "";
				else {
					// ��¥�� �迭���ٰ� �Է��Ѵ�
					date[row][(i - 1) % wid] = Integer.toString(inputDate);
					inputDate++;

					// ���� ���������� �����ϸ� ���� �ٲ��ش�
					if (i % wid == 0)
						row++;

				}

			}

		} // else�����°�

	}

	
	public void printCal(int year,int month,int date2){
		
		//�޷� ���� ���
		System.out.printf("\n����������������������%d��%d������������������������",year,month);
		System.out.println("\n����������������������������������������������������������");
		for(int i= 0; i < wid ; i++)
			System.out.print(day[i]+"\t");
		
		System.out.println("\n����������������������������������������������������������");
		System.out.println();
		
		//��¥ �迭 ���
		int row=0;
		for(int j=1;j<lastDay+startDay; j++){
			System.out.print(date[row][(j-1)%wid]+"\t");

			if((j-1)%wid==wid-1){
				System.out.println();
				row++;
			}
		}
	}
	
	
	
	
	
	
	
}// �ƿ���

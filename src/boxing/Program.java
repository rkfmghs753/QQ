package boxing;

public class Program {
	public static void add(Integer x){
		x++;
	}
	public static void main(String[] args) {		
		
		Integer x = new Integer(3);
		add(x);
		System.out.println(x);
		
		
		
//		Integer x = 3 ; // x�� ��������! 3�� �������� ����! boxing�Ȱ���!
		// int y = 4 ; //��� �⺻�ڷ���
		// Integer z = x+y ;
		// //�ڽ����� x�� ���� ��������Ѵ�! �װ� Unboxing!
		// //���� ������ �߸��Ȱ����� �ڵ����� ��ڽ� ���ֱ⶧���������ϴ�!
		//
		// System.out.println(z); // 7�� �� ��µȴ�>0<
		//
		
		
		
//		Object obj = new Integer(3);
//		//�䷸�����ش�
		
	}

}

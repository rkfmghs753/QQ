
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10];
		int N = 22;
		int x, y;
		// N= 10*x + y;
		x = N / 10;
		y = N - 10 * x;

		System.out.printf("0: %d\n", x);
		System.out.printf("y: %d\n", y);

		for (int i = 1; i <= 10 * (x - 1); i++) {
			num[x] = 1 + i; // x=1 �̸�1���ϳ����ϰ� 2�� 2���ϳ������ؾߴ碌
			for (int j = 0; j < 10; j++)
				System.out.printf("%d\n", num[j]);

		}

	}

}

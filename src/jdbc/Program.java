package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// JDBC�� ��������

		// Class.forName("oracle.jdbc.driver.OracleDriver"); //�ֽŹ����̸� �� ����
		// �Ƚᵵ���.

		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";

		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� �˻��� �Է�:");
		String s = scan.next();

		String sql = "SELECT*FROM MEMBER WHERE NAME LIKE '%" + s + "%'";
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		// while (rs.next()) {
		//
		// String mid = rs.getString("MID");
		//
		// System.out.println(mid);
		//
		// }
		while (rs.next()) {
			String mid = rs.getString("MID");
			String name = rs.getString("NAME");
			String age = rs.getString("AGE");
			System.out.printf("�Ƶ�: %s �̸�:%s ����:%s\n", mid, name, age);
		}

	}
}

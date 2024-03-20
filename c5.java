package today;

public class c5 {

	public static void main(String[] args) {
		int row = 2;
		while (row < 10) {
			int coLumn =1;
			while (coLumn < 10) {
				System.out.printf("%4d",row * coLumn);
				coLumn++;
			}
			System.out.println();
			row++;
		}
	}

}

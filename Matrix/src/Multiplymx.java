
import java.util.Scanner;

public class Multiplymx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int r = scan.nextInt();
		int c = scan.nextInt();

		int r1 = scan.nextInt();
		int c1 = scan.nextInt();

		int arr[][] = new int[r][c];

		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				arr[i][j] = scan.nextInt();

		int brr[][] = new int[r1][c1];

		for (int i = 0; i < r1; i++)
			for (int j = 0; j < c1; j++)
				brr[i][j] = scan.nextInt();
		if (c != r1)
			System.out.println("invalid");
		else {
			int res[][] = new int[r][c1];
			int s = 0;
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c1; j++) {
					for (int k = 0; k < c; k++) {
						s += arr[i][k] * brr[k][j];
					}
					res[i][j] = s;
					s = 0;
				}
			}
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					System.out.print(res[i][j] + " ");
				}
				System.out.println();

			}

		}

	}

}
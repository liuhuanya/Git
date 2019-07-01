
public class Demo01 {

	public static void main(String[] args) {

		int row = 9;

		for (int i = 0; i <= row; i++) {

			for (int j = 0; j <= row; j++) {

				if (i < row / 2 && (j < row / 2 - i || j > row / 2 + i)
						|| i > row / 2 && (j < i - row / 2 || j >= row + row / 2 - i)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}

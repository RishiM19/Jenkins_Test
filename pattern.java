import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		int rows = readRows(args);

		for (int row = 1; row <= rows; row++) {
			printSpaces(rows - row);
			printStars(row);
			System.out.println();
		}
	}

	private static int readRows(String[] args) {
		if (args.length > 0) {
			return parseRows(args[0]);
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of pyramid rows: ");
		return parseRows(scanner.nextLine());
	}

	private static int parseRows(String value) {
		int rows;

		try {
			rows = Integer.parseInt(value.trim());
		} catch (NumberFormatException exception) {
			throw new IllegalArgumentException("Please provide a valid whole number.");
		}

		if (rows <= 0) {
			throw new IllegalArgumentException("The number of rows must be greater than zero.");
		}

		return rows;
	}

	private static void printSpaces(int count) {
		for (int index = 0; index < count; index++) {
			System.out.print(" ");
		}
	}

	private static void printStars(int count) {
		for (int index = 0; index < count; index++) {
			System.out.print("* ");
		}
	}
}

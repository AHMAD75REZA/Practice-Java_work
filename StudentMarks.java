
//Array for Studentmarks;
//import java.util.*;
import java.io.*;

public class StudentMarks {
	public static void main(String[] args) throws IOException {

		final int Max = 4;
		int sum = 0;
		int[] marks = new int[Max];
		if (args.length != Max) {
			System.out.println("Enter four marks");
			// return;
		}
		for (int i = 0; i < Max; i++) {
			marks[i] = Integer.parseInt(args[i]);
			for (i = 0; i < Max; i++)
				sum += marks[i];

		}
		System.out.println("Average: " + ((double) (sum / Max)));
		return;
	}
}
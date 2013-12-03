import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Students {
	public static void main(String[] args) throws IOException{
		File file = new File("class.csv");
		Scanner s = new Scanner(System.in);
		Scanner scan = new Scanner(file);
		System.out.println("Press 1 to choose a random student.");
		System.out.println("Press 2 to choose a group of students.");
		int num = s.nextInt();
		String[] students = scan.nextLine().split(",");
		Random r = new Random();
		shuffle(students, r);
		//int firstName = r.nextInt(students.length);
		if (num == 1) {
			System.out.println(students[0]);
		}
		if (num == 2) {
			System.out.println("How many people in each group?");
			int groupNum = s.nextInt();
			int name = 0;
			for (int i = 0; i<students.length; i++) {
				for (int x = 0; i<groupNum; x++) {
					System.out.print(students[name]);
					name++;
				}
				System.out.println("");
			}
		}
	}
	public static void shuffle(String[] students, Random r) {
		for (int i = students.length-1; i>0; i--) {
			String a = students[i];
			int temp = r.nextInt(i);
			students[i] = students[temp];
			students[temp] = a;
		}
		
	}
}

import java.util.Scanner;
public class Grading {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score;
		System.out.print("점수를 입력");
		score=scn.nextInt();
		if(score>=90) {
			System.out.println("학점A");
		}
		else if(score>80) {
			System.out.println("학점B");
		}
		else if(score>70) {
			System.out.println("학점C");
		}
		else if(score>60) {
			System.out.println("학점D");
		}
		else if(score>50) {
			System.out.println("학점F");
		}
	}

}

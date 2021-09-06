import java.util.Scanner;
public class Bonus {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		final int T = 1000;
		int m,b;
		String result;
		System.out.println("실적을 입력(단위 만원):");
		m=scn.nextInt();
		if(m-T>0) {
			result ="실적달성";
			b=(m-T)/10;
		}
		else {
			result="실적달성 못함";
					b=0;
		}
		System.out.println(result+"보너스="+b);
	}

}

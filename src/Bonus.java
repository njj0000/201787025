import java.util.Scanner;
public class Bonus {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		final int T = 1000;
		int m,b;
		String result;
		System.out.println("������ �Է�(���� ����):");
		m=scn.nextInt();
		if(m-T>0) {
			result ="�����޼�";
			b=(m-T)/10;
		}
		else {
			result="�����޼� ����";
					b=0;
		}
		System.out.println(result+"���ʽ�="+b);
	}

}

import java.util.Scanner;
public class Box {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		double w,h,a,p;
		
		System.out.println("�簢���� ���̸� �Է�");
		h=scn.nextDouble();
		System.out.println("�簢���� �ʺ� �Է�");
		w=scn.nextDouble();
		
		a=w*h;
		p=2.0*(w+h);
		System.out.println("�簢���� ������"+a);
		System.out.println("�簢���� ���̴�"+p);
		
	}

}

import java.util.Scanner;
public class Box {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		double w,h,a,p;
		
		System.out.println("사각형의 높이를 입력");
		h=scn.nextDouble();
		System.out.println("사각형의 너비를 입력");
		w=scn.nextDouble();
		
		a=w*h;
		p=2.0*(w+h);
		System.out.println("사각형의 면적은"+a);
		System.out.println("사각형의 넓이는"+p);
		
	}

}

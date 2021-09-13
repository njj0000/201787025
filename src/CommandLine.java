import java.util.Scanner;

public class CommandLine {
	public static void main(String[] args) {
		String a="abccd";
		String b= "abcd";
		String c= "Dsfds";
		String d=new String("abcd");
		if(args.length>0) {
		if(args[0].equals("-h"))
		System.out.println("help");
		else
			for(int i=0;i<args.length;i++) {
				System.out.println(args[i]);
			}
		}else {
			System.out.println("실행할때 뒤에 아무것도 없이 실행했넹?");
		} 
	}

}

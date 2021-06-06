package training;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(args[0]+" "+args[1]);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("Addition :"+args[0]+args[1]);
		int s=(a-b);
		System.out.println("Addition :"+s);
		int M=(a*b);
		System.out.println("Addition :"+M);
		int d=(a/b);
		System.out.println("Addition :"+d);
	}

}

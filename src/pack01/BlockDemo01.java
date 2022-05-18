package pack01;

public class BlockDemo01 {
	int b;
	static int c;

	{
		System.out.println("Instance Block");
		b=10;
	}
	static {
		System.out.println("Static Block");
		c=20;
	}
	public static void main(String[] args) {
		System.out.println("c= "+c);
		BlockDemo01 a=new BlockDemo01();
		System.out.println("b= "+a.b);
		

	}

}

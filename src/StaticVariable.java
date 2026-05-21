public class StaticVariable {
    static int a=108;
	StaticVariable(){
		System.out.println(a);
		a++;
		System.out.println(a);
		
	}
	public static void main(String[] args)
	{
		new StaticVariable();
	}

    
}

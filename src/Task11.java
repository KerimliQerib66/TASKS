
public class Task11 {

	public static void main(String[] args) {
//		public static void foo(int a, char c, boolean altAlta)
//
//		a qeder c simvolunu chap etsin. altAlta dəyişəni true-dursa altAlta eks halda yan yana chap etsin
		foo(5,'a',false);
		
		
	}
	
	public static void foo(int a,char c,boolean altAlta)
	{
		for(int i=0;i<=a;i++)
		{
			if(altAlta==true)
		{
				System.out.println(c);
		}
			else
			{
				System.out.print(c);
			}
		}
		
	}

}


public class Task16 {

	public static void main(String[] args) {
  foo("salam",4);
	}
   public static void foo(String a,int b)
   {
	   char [] arr=a.toCharArray();
	   for(int i=0;i<arr.length;i++)
	   {
		   if(i==b-1)
		   {
			   System.out.print(arr[i]);
		   }
	   }
   }
}

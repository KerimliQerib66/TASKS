import java.util.ArrayList;
import java.util.List;

public class Task12 {

	public static void main(String[] args) {
//		10.method 3 reqem qebul edir a,b,c,
//
//		public static void foo(int a, int b, int c)
//
//		a-dan b-ye qeder butun ededleri c qeder quvvete yukseldir Math.pow-dan istifadə edərək
//
//		foo(1,5,2) -> 1^2=1; 2^2=4; 3^2=9, 4^2=16, 5^2=25       
		
		foo(1,5,3);
	}
  public static void foo(int a,int b,int c)
           {
	  double temp=0;
	  int sub=b-a;
       double [] arr=new double[sub];
        	 for(int i=a;i<=b;i++)
        	 {
        		temp=Math.pow(i, c);
        		 System.out.println(temp);
        	 }
        	
        	 }
//        	 for(int i=0;i<arr.length;i++)
//        	 {
//        	 System.out.print(arr[i]);
//           }
           }


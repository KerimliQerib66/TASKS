
public class Task4 {

	public static void main(String[] args) {
        int a=2315; 
        int dividednumber=1;
        int sum=0;
		String A=String.valueOf(a);
        int mertebe=A.length();
        //converttozero
      for(int i=0;i<mertebe;i++) {
       	dividednumber*=10;
       }
      //divideoperation
      for(int i=0;i<=mertebe;i++)
      {
    	  sum+=(a/dividednumber);
    	  a=a%dividednumber;
    	  dividednumber=dividednumber/10;
      }
      System.out.println(sum);
    //eger 5 mertebelidirse 10000 e bolsun,sonra 1000 e bolsun
}
	 
		  
		  

}

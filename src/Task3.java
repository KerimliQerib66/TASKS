
public class Task3 {

	public static void main(String[] args) {
		// 0 dan verilmis edede qeder sade ededleri tap
		int count;
      int x=100;
      for(int i=2;i<=x;i++)
      {
    	  count=0;
    	 for(int j=2;j<=i;j++)
    	 {
    		 if(i%2==0)
    		 {
    			 count++;
    		 }
    	 }
    	 if(count<=2)
    	 {
    		 System.out.print(i+" sade ededdir");
    		 
    	 }
	
      }      
	}
}

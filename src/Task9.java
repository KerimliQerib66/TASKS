import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     int counttr=0;
     int countfl=0;
     char [] arr=s.toCharArray();
     String reverse="";
     
     for(int k=arr.length-1;k>=0;k--)
     {
    	 reverse+=arr[k];
     }
     char [] arr1=reverse.toCharArray();
    
     for(int i=0;i<arr1.length;i++)
     {
    	  if(arr[i]!=arr1[i])
    	     {
    		  countfl++;
    	     }
            
            else {
            	counttr++;
            }
    	  }
     if(countfl==0)
     {
    	 System.out.print(true);
     }
     else {
    	 System.out.print(false);
     }
         
    	 
     }
   
     }
	
	



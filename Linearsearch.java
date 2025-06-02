import java.util.*;
public class Linearsearch{
     public static void main(String[] args){
       int [] a=new int[5];
	   Scanner sc=new Scanner(System.in);
	   for(int i=0;i<a.length;i++){
	       a[i]=sc.nextInt();
	   }
	   int m=5;
	   int flag=1;
	   for(int i=0;i<a.length;i++){
	      if(a[i]==m){
		    System.out.println(" found at index"+i);
			flag=0;
			break;
		}
	   }
		if(flag==1){
			System.out.println("not found");
		}
	  }
	}
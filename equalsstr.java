import java.util.*;
public class equalsstr{
  public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
	   String a=sc.nextLine();
	   String b=sc.nextLine();
	   if(a.length()!=b.length()){
	     System.out.println(" not equal");
		 System.exit(0);
	   }
	   for(int i=0;i<a.length();i++){
         char ch=a.charAt(i);
		 char ch1=b.charAt(i);
	     if(ch!=ch1){
	   	     System.out.println(" not equal");
			 System.exit(0);
	   }
	   }
     System.out.println("equal");
}
}
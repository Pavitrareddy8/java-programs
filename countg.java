import java.util.*;
public class countg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int count=0;
        while(n!=0){
            int rem=n%10;
            for(int i=0;i<=9;i++){
                if(i==rem){
                    if(m%i==0){
                        count++;
                    }
                }
            }
            n=n/10;
            
        }
        System.out.println(count);
    }
}
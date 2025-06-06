public class nonstaticfun{
 public void add()
 {
 int a=3;
 int b=5;
 int c=a+b;
 System.out.println(c);
 }
 public static void main(String[] args){
 nonstaticfun n=new nonstaticfun();
 n.add();
 }
 }
 
 
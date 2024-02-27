import java.util.*;
 class swap
{
public static void main(String[] args)
{
Scanner s1=new Scanner(System.in);
Scanner s2=new Scanner(System.in);


int a,b,temp;
a=s1.nextInt();
b=s2.nextInt();
System.out.println("before swapping a is" +a+"b is "+b );
temp=a;
a=b;
b=temp;
System.out.println("after swapping a is" +a+"b is "+b );

}
}
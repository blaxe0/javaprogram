import java.util.*;
 class smallofno
{
public static void main(String[] args)
{
Scanner s1=new Scanner(System.in);
Scanner s2=new Scanner(System.in);
Scanner s3=new Scanner(System.in);

int a,b,c;

a=s1.nextInt();
b=s2.nextInt();
c=s3.nextInt();

if(a<b && a<c)
System.out.println("a is smaller");
else if (b<a && b<c)
System.out.println("b is smaller");
else
System.out.println("c is smaller");
}
}
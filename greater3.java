import java.util.*;
class sumofno
{
public static void main(String[] args){

Scanner s1= new Scanner(System.in);
Scanner s2=new Scanner(System.in);
Scanner s3=new Scanner(System.in);

int a,b,c;

a=s1.nextInt();
b=s2.nextInt();
c=s3.nextInt();

if (a>b && a>c)
{
System.out.println("a is greater");
}
else if (b>c && b>a)
{
System.out.println("b is greater");
}
else{
System.out.println("c");
}
}
}
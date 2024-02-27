import java.util.*;
 class evennum
{
public static void main(String[] args)
{

Scanner s1=new Scanner(System.in);

String num=s1.next();

char[] array=num.toCharArray();

int count=0;


for(int l=0;l<num.length();l++)
{
 if(array[l]%2==0)
{
 System.out.println(array[l]);
 count++;
}
}
System.out.println(count);

}
}
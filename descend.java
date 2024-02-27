import java.util.*;
 class descend
{
public static void main(String[] args)
{

int temp;
Scanner s1=new Scanner(System.in);
int arr_size=s1.nextInt();
int[] array=new int[arr_size];
System.out.println("ENTER THE ELEMENTS" );
for(int i=0;i<arr_size;i++)
{
 array[i]=s1.nextInt();
}


for(int l=0;l<arr_size;l++)
{
 for(int j=l+1;j<arr_size;j++)
{
  if(array[l]<array[j])
   {
    temp=array[l];
    array[l]=array[j];
    array[j]=temp;

   }
   
}
}

System.out.print(Arrays.toString(array));
}
}
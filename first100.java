class First100EvenNumbers{
public static void main(String[] args){

System.out.println("TO PRINT FIRST 100 EVEN NUMBERS:");
System.out.println("The numbers are: ");
for(int even = 1; even <= 100; even++){
   if(even % 2 == 0)
      System.out.print(" "+even);
}
}
}
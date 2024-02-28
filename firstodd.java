class First100OddNumbers{
public static void main(String[] args){

System.out.println("TO PRINT FIRST 100 ODD NUMBERS:");
System.out.println("The numbers are: ");
for(int odd = 1; odd <= 100; odd++){
   if(odd % 2 == 1)
      System.out.print(" "+odd);
}
}
}
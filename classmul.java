class MultiplesOf3{

public static void main(String[] args){

System.out.println("TO PRINT THE MULTIPLES OF THREE FROM 1 TO 100:");
System.out.println("The Multiples are as follows:");
for(int mul3 = 1; mul3 <= 100; mul3++){
   if(mul3 % 3 == 0)
      System.out.print(" "+mul3);
}
}
}
class MultiplesOfTwoThree{

public static void main(String[] args){

System.out.println("TO PRINT THE MULTIPLES OF TWO AND THREE FROM 1 TO 100:");
System.out.println("The Multiples are as follows:");
for(int mul = 1; mul <= 100; mul++){
    if(mul % 2 == 0 && mul % 3 == 0)
      System.out.print(" "+mul);
}
}
}
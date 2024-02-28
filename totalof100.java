class TotalOfFirst100{
public static void main(String[] args){

System.out.println("TO PRINT TOTAL OF FIRST 100 NUMBERS:");
System.out.print("The numbers are: ");
int result = 0;
for(int total = 1; total <= 100; total++){
   System.out.println(" "+total);
   result += total;
} 
System.out.println("The Answer is: "+result);
}
}
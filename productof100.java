class ProductOfFirst100{
public static void main(String[] args){

System.out.println("TO PRINT PRODUCT OF FIRST 100 NUMBERS:");
System.out.println("The numbers are: ");
long result = 1L;
for(int product = 1; product <= 100; product++){
   System.out.println(" "+product);
   result *= product;
} 
System.out.println("The Answer is: "+result);
}
}
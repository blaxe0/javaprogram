class UsingContinue{

public static void main(String[] args){
System.out.println("TO PRINT NUMBERS USING CONTINUE:"); 
System.out.println("The Numbers are:");
for(int N = 1; N <= 10; N++){
   if(N == 5)
      continue;
   System.out.println(N);
}
}
}
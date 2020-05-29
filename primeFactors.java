
import java.util.Scanner;

public class primeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		StackOfIntegers stack1 = new StackOfIntegers();
		int num;
      int num2;

		System.out.println("Enter a positive integer and I will display its prime factors from largest to smallest: ");
		num = in.nextInt();
      num2 = num;
      
      for (int i = 2; i < num; i++) {
         while (num % i == 0) {
            stack1.push(i);
            num = num / i;
         }
      }
      
      if (num > 2) {
         stack1.push(num);
      }
      
      for (int j = 2; j < num2; j++) {
         while (num2 % j == 0) {
            System.out.println(stack1.pop());
            num2 = num2 / j;
         }
      }
      
      if (num2 > 2) {
         System.out.println(stack1.pop());
      }
      
	}

}

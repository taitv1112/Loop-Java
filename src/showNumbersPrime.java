import java.util.Scanner;

public class showNumbersPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of primes to print:  ");
        int numbers = sc.nextInt();
        int count = 0;
        int[] result = {};
        for (int i = 2; count < numbers ; i++) {
            if(isPrime(i)){
                System.out.print(i+", ");
                count++;
            }
        }
    }
    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        } else {
            int i = 2;

            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}

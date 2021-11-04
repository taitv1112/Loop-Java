import java.util.Scanner;

public class showPrimeLess100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit of primes to print:  ");
        int numbers = sc.nextInt();
        for (int i = 2; i < numbers ; i++) {
            if(isPrime(i)){
                System.out.print(i+", ");
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

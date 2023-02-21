import java.util.Scanner;

    public class Main {
        public static void main(String[] args){

            long i;
            long number;
            long sum;

            Scanner sc = new Scanner(System.in);

            System.out.println("Please Enter the minimum value: ");
            long minValue = sc.nextLong();

            System.out.println("Please Enter the maximum value: ");
            long maxValue = sc.nextLong();

            for (number = minValue; number <= maxValue; number++) {
                for(i = 1, sum = 0; i < number; i++)  {
                    if(number % i == 0){
                        sum += i;
                    }
                }
                if (sum == number) {
                    System.out.println(number + " is a perfect number");
                }
            }
        }
    }

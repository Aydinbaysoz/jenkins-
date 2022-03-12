public class reverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        while (num > 0) {
            int reverse = num % 10;
            System.out.println(reverse);
             num = num / 10;

        }
        System.out.println("Give me break please! Ok,i will ");

        int num1 = 34572;
        while (num1 > 0 ){
            int reverse1 = num1 % 10 ;
            System.out.println(reverse1);
            num1 = num1 / 10;
        }

        System.out.println("Give break again please!, you are crazy, no i am not gonna ");

        long num2 = 4846628L;
        while (num2 > 0 ){
            long reverse2 = num2 % 10;
            System.out.println(reverse2);
            num2 = num2 / 10;
        }
    }
}

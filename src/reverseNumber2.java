public class reverseNumber2<sout> {

    public static void main(String[] args) {
        int  num4 = 823767;
        while (num4 > 0){
            int reverse = num4 % 10;
            System.out.println(reverse);
            num4 = num4 / 10;
        }

        StringBuffer str = new StringBuffer("Reverse me");
        System.out.println(str.reverse());

        StringBuilder str1 = new StringBuilder("CANADA");
        System.out.println(str1.reverse());

        StringBuffer str2 = new StringBuffer("Toronto");
        System.out.println(str2.reverse());
        System.out.println(str2.append(" York  "));
        str2.trimToSize();

        int num2 = 12345;
        while ( num2 >0 ){
            int reverse = num2 % 10;
            System.out.println(reverse);
            num2 = num2 / 10;
        }

        


    }

}

public class reverseNumber3 {
    public static void main (String [] args){

        String s = "Reverse";
        String t = " ";

        for ( int i = s.length()-1; i>=0; i-- ) {

            t = t + s.charAt(i);

            System.out.println(i);

        }
        StringBuffer str = new StringBuffer("Reverse");
        System.out.println(str.reverse());

    }

}

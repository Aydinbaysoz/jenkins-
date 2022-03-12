public class reverse5 {
    public static void main(String[] args) {

        String c = "123456";
        String d = "";

        for ( int i = c.length()-1; i>=0; i--){

            d = d + c.charAt(i);
        }
        System.out.println(d);
    }
}

public class reverse10 {

    public static void main(String[] args) {

        String a = "SANLIURFA";
        String b = "";

        for (int i = a.length()-1; i>=0; i--) {
            b = b + a.charAt(i);
        }
        System.out.println(b);
    }
}

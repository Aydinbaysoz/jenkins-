public class reverse6 {
    public static void main(String[] args) {

        String a = "Are you ok?";
        String b = "";

        for (int i = a.length()-1; i>=0; i--) {
            b = b + a.charAt(i);
        }
        System.out.println(b);
    }
}

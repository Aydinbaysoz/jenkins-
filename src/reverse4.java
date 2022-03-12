public class reverse4 {
    public static void main(String[] args) {

        String a = "DO NOT REVERSE ME PLEASE!";
        String b = "";

        for (int i = a.length()-1; i>=0; i--) {

            b = b + a.charAt(i);
        }

        System.out.println(b);
    }
}

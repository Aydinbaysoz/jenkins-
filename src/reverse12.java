public class reverse12 {
    public static void main(String[] args) {

        String a = "Esenboga";
        String b = "";

        for (int i = a.length()-1; i>=0; i--){
            b = b + a.charAt(i);
        }
        System.out.println(b);

        String c = "Mardin";
        String d = "";

        for (int i = c.length()-1; i>=0; i--){
            d= d + c.charAt(i);
        }
        System.out.println(d);
    }
}

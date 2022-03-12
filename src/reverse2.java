public class reverse2 {
    public static void main(String[] args) {

        String first = "AYDIN";
        String second = "";

        for(int i=first.length()-1; i>=0; i--){
            second = second + first.charAt(i);
        }

        System.out.println(second);
    }
}

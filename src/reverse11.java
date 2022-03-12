public class reverse11 {
    public static void main(String[] args) {

        String a = "Halfeti";
        String b = "";

        for (int i = a.length()-1; i>=0; i--){
            b = b + a.charAt(i);
        }
        System.out.println(b);

        StringBuffer str = new StringBuffer("Diyarbakir");
        System.out.println(str.reverse());

    }
}

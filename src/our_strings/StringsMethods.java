package our_strings;

public class StringsMethods {

    public static void main(String[] args) {
        System.out.println(doubleLength("George"));
        System.out.println(putTogether());
        System.out.println(moveLetters("abcd"));
    }

    static int doubleLength(String str) {
        return str.length() * 2;
    }

    static String putTogether() {
        String s1 = "Hello";
        String s2 = "There";
        String result = ("Hello".substring(1) + "There".substring(1)).toUpperCase();
        return result;
    }

    static String moveLetters (String str){
        return str.substring(1)+str.substring(0,1);
    }

}

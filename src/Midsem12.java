public class Midsem12 {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = new String("java");
        String str3 = str2.intern();
        System.out.println(str1 == str3);
        System.out.println(str1 == str2);
        String str4 = str2;
        System.out.println(str1 == str4);
        System.out.println(str2 == str4);
    }
}

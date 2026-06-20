public class Lab8_1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Object Oriented Programming");
        sb.append(" in Java");
        int index = sb.indexOf("Oriented") + "Oriented".length() + 1;
        sb.insert(index, "Concepts ");
        int start = sb.indexOf("Programming");
        if (start != -1) {
            int end = start + "Programming".length();
            sb.replace(start, end, "Paradigm");
        }
        System.out.println("After manipulation: " + sb);
        sb.reverse();
        System.out.println("After reversing: " + sb);
    }
}

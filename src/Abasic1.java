public class Abasic1 {
    static class student {
        String name;
        int age;

        student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        student[] arr = new student[5];
        for (int i = 0; i < 5; i++) {
            arr[0] = new student("ghannath", 13);
        }
        System.out.println(arr[0].age);
    }
}

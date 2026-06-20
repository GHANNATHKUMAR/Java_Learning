import java.sql.SQLOutput;

class hello {
    int i;

    public void display() {
        System.out.println(" ggg hannath ");
    }
}

class hello1 extends hello {
    int j;

    //     public void display(){
//         System.out.println(" ghannath k ");
//     }
    public void display() {
        System.out.println(" ghannath ");
    }
}

class Midsem9 {
    public static void main(String[] args) {
        hello1 a = new hello1();
        a.i = 1;
        a.j = 2;
        System.out.println((a.i) + "" + a.j);
        hello r;
        r = a;
        r.display();
        String s2 = "NITPATNA";
        String s3 = "PATNA";
        System.out.println(s2.contains(s3));
    }
}

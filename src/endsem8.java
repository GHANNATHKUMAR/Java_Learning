abstract class sunstar{
    abstract void printinfo();
}
class employee1 extends  sunstar{
    void printinfo(){
        String name="ghannath kumar";
        int age=21;
        float salary=23.09f;
        System.out.println(name);
    }
}
public class endsem8 {
    public static void main(String[] args) {
       // employee1 s=new employee1(); also we can
        sunstar s=new employee1();
        s.printinfo();

    }
}

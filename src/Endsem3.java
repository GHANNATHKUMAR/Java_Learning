
class box {
    double l;
    double h;
    double w;

    box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    box(double length, double height, double width) {
        this.l = length;
        this.h = height;
        this.w = width;
    }

    box(box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

}

class boxweight extends box {
    double weight;

    boxweight() {
        this.weight = 0;
    }

    boxweight(double weight) {
        this.weight = weight;
    }

    boxweight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    boxweight(boxweight other) {
        super(other);
        this.weight = other.weight;
    }
}

// signature means jo tum parameter pass karte ho vo inside every constructor , methods etc
public class Endsem3 {
    public static void main(String[] args) {

        box box1 = new box();
        System.out.println(box1.h + "," + box1.l + "," + box1.w);
        boxweight box3 = new boxweight(4, 5, 6, 8);

        System.out.println("hi" + box3.h);
        boxweight box4 = box3;
        boxweight box5 = new boxweight(box3);
        System.out.println(" hello" + box5.h);
    }
}


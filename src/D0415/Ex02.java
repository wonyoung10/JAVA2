package D0415;

import java.security.CryptoPrimitive;

class Circle {
    int raduis;
    public Circle(int raduis) {
        this.raduis = raduis;
    }
    public double getArea() {
        return 3.14 * raduis * raduis;
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Circle[] c;
        c = new Circle[5];

        for(int i = 0;i <c.length;i++) {
            c[i] = new Circle(i);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print((int) (c[i].getArea()) + " ");
        }
    }
}

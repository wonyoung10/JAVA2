package D0415;

public class Ex01 {
    int raduis;
    String name;

    public double getArea() {
        return 3.14 * raduis * raduis;
    }
    
    public static void main(String[] args) {
        Ex01 pizza;
        pizza = new Ex01();
        pizza.raduis = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Ex01 donut = new Ex01();
        donut.raduis = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }   
}

abstract class Shape {
    public abstract double Area();

    public abstract double Perimeter();
}

class Rectangle extends Shape {
    double w;
    double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double Area() {
        return this.w * this.h;
    }

    @Override
    public double Perimeter() {
        return 2 * (this.w + this.h);
    }

}

class Triangle extends Shape {
    double a, b, c, h;

    public Triangle(double a, double b, double c, double h) {
            this.a=a;
            this.b=b;
            this.c=c;
            this.h=h;
    }

    @Override
    public double Area() {
        return 0.5*this.b*this.h;
    }

    @Override
    public double Perimeter() {
        return this.a+this.b+this.c;
    }
}

public class Q12 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3, 6);
        Triangle tri =  new Triangle(5, 6, 7, 3);

        System.out.println("Perimeter of rectangle "+rec.Perimeter());
        System.out.println("Area of rectangle "+rec.Area());
        System.out.println();

        System.out.println("Perimeter of Triangle "+tri.Perimeter());
        System.out.println("Area of Triangle "+tri.Area());
    }
}
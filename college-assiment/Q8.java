abstract class ThreeDObject {
    public abstract double wholeSurfaceArea();

    public abstract double volume();
}

class Box extends ThreeDObject {
    double l;
    double w;
    double h;

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    @Override
    public double wholeSurfaceArea() {
        return (2 * l * w) + (2 * l * h) + (2 * h * w);
    }

    @Override
    public double volume() {
        return l * w * h;
    }
}

class cube extends ThreeDObject {
    double side;

    public cube(double side) {
        this.side = side;
    }

    @Override
    public double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}

class cylinder extends ThreeDObject {
    double r;
    double h;

    public cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }

    @Override
    public double volume() {
        return Math.PI * r * r * h;
    }
}

class cone extends ThreeDObject {
    double r;
    double h;

    public cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double wholeSurfaceArea() {
        double slanheight = Math.sqrt(r * r + h * h);
        return Math.PI + r * (r + slanheight);
    }

    @Override
    public double volume() {
        return 2 * Math.PI * r * r * h;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Box b1 = new Box(3, 6, 7);

        cube c1 = new cube(5);

        cylinder cy1 = new cylinder(5, 7);

        cone co1 = new cone(7, 8);

        System.out.println("Area of Box " + b1.wholeSurfaceArea());
        System.out.println("volum of Box " + b1.volume());
        System.out.println("Area of cube " + c1.wholeSurfaceArea());
        System.out.println("volum of cube " + c1.volume());

        System.out.println("Area of cylinder " + cy1.wholeSurfaceArea());
        System.out.println("volum of cylinder " + cy1.volume());

        System.out.println("Area of cone " + co1.wholeSurfaceArea());
        System.out.println("volum of cone " + co1.volume());
    }
}

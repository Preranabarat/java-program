class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

}

class Circle {
    double radius;
    Point ob;

    public Circle(int radius,Point ob) {
        this.radius = radius;
        this.ob=ob;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }

    public void displayArea(){
        System.out.println("Circle Center : ("+ob.getX()+","+ob.getY()+")");
        System.out.println("Area of the Circle: "+Area());
    }
}

class Time {
    private int hour;
    private int min;
    private int sec;

    // Constructor to initialize the time
    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    // Method to add the calling Time object with the passed Time object
    public void add(Time t) {
        int totalSec = this.sec + t.sec;
        int totalMin = this.min + t.min + (totalSec / 60);
        int totalHour = this.hour + t.hour + (totalMin / 60);

        totalSec %= 60; // Remainder seconds
        totalMin %= 60; // Remainder minutes
        totalHour %= 24; // Remainder hours (24-hour format)

        System.out.println("Added Time: " + totalHour + " hours, " + totalMin + " minutes, " + totalSec + " seconds");
    }
}
public class Q11 {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Circle cr = new Circle(5,p1);
        cr.displayArea();

        System.out.println();
        Time time1 = new Time(10, 45, 50);
        Time time2 = new Time(3, 30, 20);

        time1.add(time2);
    }
}

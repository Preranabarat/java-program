class Vehicle{
    protected int regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    public void showData(){
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle{

        private int routeNumber;

        public Bus(int regnNumber, int speed, String color, String ownerName,int routeNumber){
            this.regnNumber=regnNumber;
            this.speed = speed;
            this.color=color;
            this.ownerName=ownerName;
            this.routeNumber=routeNumber;
        }

        @Override
        public void showData(){
            System.out.println("This is a Bus class");
            System.out.println("regnNumber : "+regnNumber);
            System.out.println("speed : "+speed+" km/h");
            System.out.println("colour : "+color);
            System.out.println("ownerName : "+ownerName);
            System.out.println("routeNumber : "+routeNumber);
        }
}


class Car extends Vehicle{
    private String manufacturerName;

    public Car(int regnNumber, int speed, String color, String ownerName,String manufacturerName){
            this.regnNumber=regnNumber;
            this.speed = speed;
            this.color=color;
            this.ownerName=ownerName;
            this.manufacturerName=manufacturerName;
    }


    @Override
    public void showData(){
        System.out.println("This is a Car class");
        System.out.println("regnNumber : "+regnNumber);
        System.out.println("speed : "+speed+" km/h");
        System.out.println("colour : "+color);
        System.out.println("ownerName : "+ownerName);
        System.out.println("manufacturerName : "+manufacturerName);
    }
}

public class Question9 {
    public static void main(String[] args) {
        Bus b1 = new Bus(1234,80,"Red","Nikhil",45);
        Car c1 = new Car(5678,100,"White","Samrat","Toyota");
        b1.showData();
        System.out.println();
        c1.showData();
    }
}

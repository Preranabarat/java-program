class square1{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class rectangle{
    int l,w;
    public int perimeter1(){
        return 2*(l+w);
    }
    public int area1(){
        return w*l;
    }
}
class tommy{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("running from the enemy");
    }
    public void fire(){
        System.out.println("firing on the enemy");
    }
}
class circle{
    int r;
    public int area2(){
        return 22/7*r*r;
    }
    public int perimeter2(){
        return 2*22/7*r;
    }
}

public class square {
    public static void main(String[] args) {
       //problem 3
       square1 sq =new square1();
       sq.side=4;
       System.out.println(sq.area());
       System.out.println(sq.perimeter());
       //problem 4
       rectangle obj=new rectangle();
       obj.l=4;
       obj.w=6;
       System.out.println(obj.area1());
       System.out.println(obj.perimeter1());
       //problem 5
       tommy player=new tommy();
       player.fire();
       player.run();
       player.hit();
       //problem 6
        circle redius=new circle();
        redius.r=5;
        System.out.println(redius.area2());
        System.out.println(redius.perimeter2());

    }
}

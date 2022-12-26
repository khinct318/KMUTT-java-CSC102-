import java.util.Scanner;
class Cuboid{
    private double height;
    private double width;
    private double length;
    
    public Cuboid(){
        this.height = 1;
        this.width = 1;
        this.length = 1;
    }
    
    public Cuboid(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }
    
    public double getVolumn(){
        double vol = width * height * length;
        return vol;
    }
    
    public double getSurface(){
        double sur = 2*(width * height) + 2*(width * length) + 2*(height * length);
        return sur;
    }
}
public class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt==1){
            Cuboid c = new Cuboid();
            System.out.println(c.getVolumn());
            System.out.println(c.getSurface());
        }
        else{
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            Cuboid c = new Cuboid(x,y,z);
            System.out.println(c.getVolumn());
            System.out.println(c.getSurface());
        }

    }
}

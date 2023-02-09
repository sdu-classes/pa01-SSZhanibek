
public class Main {
    public static void main(String[] args) {

    }
}
class Circle{
    private double radius;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double gerArea(){
        return  Math.PI * Math.pow(radius,2);
    }
    public  double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public String toString(){
        return "" + radius;
    }

}

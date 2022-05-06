package Bai04;

public class Mypoint {
    private double x;
    private double y;
    public Mypoint(){
        x=0;
        y=0;
    }


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }


    public Mypoint(double x, double y){
        this.x=x;
        this.y=y;

    }

    public Mypoint(Mypoint p) {
        this.x=p.x;
        this.y=p.y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Mypoint p1){
        return(Math.sqrt((p1.x-this.x)*(p1.x-this.x)+(p1.y-this.y)*(p1.y-this.y)));
    }
    public double distance(Mypoint p1, Mypoint p2){
        return(Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y)));
    }
}

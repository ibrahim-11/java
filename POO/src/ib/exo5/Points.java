package ib.exo5;

public class Points {
    private double x,y;
    public Points(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void distance(Points coordonne){
        double dist= Math.sqrt(Math.pow((coordonne.x-this.x), 2)+Math.pow((coordonne.y-this.y), 2));

        System.out.println("La distance entre P1 et P2 set:"+dist);
    }
}

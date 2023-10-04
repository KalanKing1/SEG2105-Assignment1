public class PointCP3 extends PointCP5{
    double X;
    double Y;
    public PointCP3(double X,double Y){
        this.X = X;
        this.Y = Y;
    }

    public double getX(){
        return X;
    }

    public double getY(){
        return Y;
    }

    public double getRho(){
        return Math.sqrt(Math.pow(X,2)+Math.pow(Y,2));
    }
    public double getTheta(){
        return Math.toDegrees(Math.atan2(Y,X));
    }

    public String toString(){
        return "Cartesian [" + getX() + "," + getY() + "]" + "\n";
    }
}

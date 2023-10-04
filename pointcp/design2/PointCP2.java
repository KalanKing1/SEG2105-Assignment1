public class PointCP2 extends PointCP5{
    double Rho;
    double Theta;
    public PointCP2(double Rho,double Theta){
        this.Rho = Rho;
        this.Theta = Theta;
    }

    public double getX(){
        return (Math.cos(Math.toRadians(Theta))*Rho);
    }

    public double getY(){
        return (Math.sin(Math.toRadians(Theta))*Rho);
    }

    public double getRho(){
        return Rho;
    }
    public double getTheta(){
        return Theta;
    }
    public String toString(){
        return "Polar [" + getRho() + "," + getTheta() + "]" + "\n";
    }
}

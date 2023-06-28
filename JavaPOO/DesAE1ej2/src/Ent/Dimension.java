package Ent;
// @author Pablo

public class Dimension {

   private double long1;
   private double long2; 
   private double long3;

    public Dimension() {
    }

    public double getLong1() {
        return long1;
    }

    public void setLong1(double long1) {
        this.long1 = long1;
    }

    public double getLong2() {
        return long2;
    }

    public void setLong2(double long2) {
        this.long2 = long2;
    }

    public double getLong3() {
        return long3;
    }

    public void setLong3(double long3) {
        this.long3 = long3;
    }

    public Dimension(double long1) {
        this.long1 = long1;
    }

    public Dimension(double long1, double long2) {
        this.long1 = long1;
        this.long2 = long2;
    }

    public Dimension(double long1, double long2, double long3) {
        this.long1 = long1;
        this.long2 = long2;
        this.long3 = long3;
    }
    
    
    
}

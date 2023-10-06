public class Point {
    double x;
    double y;


    public Point() {    // constructor 1
        x = 0.0; y = 0.0;
    }
    public Point(double x, double y) {  // constructor 2
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point{x = " + this.x + ", y = " + this.y + "}";
    }

    // setters
    public void setX(double x) {    // this."variable" refers to the OBJECT. In methods, it can be used as such...
        this.x = x;
    }
    public void setY(double y) {    // The other value 'x' and 'y' just become what was put into the function.
        this.y = y;
    }
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // getters
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    // shifts and other special mathematical adjustors
    public void shiftX(double n) {
        this.x = this.x + n;
    }
    public void shiftY(double n) {
        this.y = this.y + n;
    }
    public void rotate(double angle) {
        this.x = (this.x * Math.cos(angle)) - (this.y * Math.sin(angle));
        this.y = (this.x * Math.sin(angle)) + (this.y * Math.cos(angle));
    }

    // distance
    public double distance(Point point2) {
        double d = 0;
        d = Math.sqrt(Math.pow(point2.getX() - this.x, 2) + Math.pow(point2.getY() - this.y, 2));
        return d;
    }
}

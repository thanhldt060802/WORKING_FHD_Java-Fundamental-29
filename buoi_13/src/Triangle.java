public class Triangle {
    
    private Point A;
    private Point B;
    private Point C;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }

    public boolean isValid() {
        // double AB = this.getAB();
        // double BC = this.getBC();
        // double AC = this.getAC();
        // return AB + BC > AC && BC + AC > AB && AB + AC > BC;

        Vector vAB = new Vector(this.A, this.B);
        Vector vAC = new Vector(this.A, this.C);
        return vAB.directionalProduct(vAC) != 0;
    }

    public double perimeter() {
        if (this.isValid()) {
            return this.getAB() + this.getBC() + this.getAC();
        }

        return 0;
    }

    public double area() {
        if (this.isValid()) {
            double p = this.perimeter() / 2;
            return Math.sqrt(p * (p - this.getAB()) * (p - this.getBC()) * (p - this.getAC()));
        }

        return 0;
    }

    public double getAB() {
        return this.A.distanceTo(this.B);
    }

    public double getBC() {
        return this.B.distanceTo(this.C);
    }

    public double getAC() {
        return this.A.distanceTo(this.C);
    }

}

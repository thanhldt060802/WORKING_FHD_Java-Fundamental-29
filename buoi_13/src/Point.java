public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }

    public double distanceTo(Point p) { // Tính khoảng cách từ this tới p
        // A: this
        // B: p
        double xAB = Math.pow(p.x - this.x, 2);
        double yAB = Math.pow(p.y - this.y, 2);
        double result = Math.sqrt(xAB + yAB);

        return result;
    }
    
}

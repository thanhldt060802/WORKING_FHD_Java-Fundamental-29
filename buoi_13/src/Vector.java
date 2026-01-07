public class Vector {
    
    private int x;
    private int y;

    public Vector(Point p1, Point p2) {
        this.x = p2.getX() - p1.getX();
        this.y = p2.getY() - p1.getY();
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

    public int directionalProduct(Vector v) { // Tính tích có hướng giữa this và v
        // Vector a(a1, a2): this
        // Vector b(b1, b2): v
        return this.x * v.y - this.y * v.x;
    }

}

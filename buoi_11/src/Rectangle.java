public class Rectangle {

    // Thông tin

    public String name;
    public int width;
    public int height;

    // Hàm khởi tạo

    // Default constructor
    public Rectangle() {
        this(1, 1);
        System.out.println("Constructor 1");
    }

    public Rectangle(int width, int height) {
        // this();
		this.width = width;
		this.height = height;
        System.out.println("Constructor 2");
	}

    public Rectangle(String name, int width, int height) {
        // this(width, height);
        this();
        this.name = name;
        System.out.println("Constructor 3");
    }

    // Hành vi
    
    public double perimeter() {
        return (this.width + this.height) * 2;
    }

    public double area() {
        return this.width * this.height;
    }

    public String getInfo() {
        return String.format("Rectangle[%s] {C=%f, S=%f}",
            this.name, this.perimeter(), this.area());
    }
    
}
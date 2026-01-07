public class Cone extends Shape3D {
	
	public int h;
	public int r;

	public Cone(String name, int h, int r) {
		super(name);
		this.h = h;
		this.r = r;
	}

    @Override
    public double calculateVolume() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateVolume'");
    }

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateArea'");
    }
	
}
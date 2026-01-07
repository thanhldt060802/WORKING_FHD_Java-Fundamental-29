public class Main {

    public static void main(String[] args) {

        /*
            Class Diagram (coding)
            Entity Relationship Diagram, Entity Diagram (database)
            Sequence Diagram, Activity Diagram, Flow Diagram (flow)
        */

        // Point p1 = new Point(1, 1);
        // Point p2 = new Point(1, 6);
        // System.out.println(p1.distanceTo(p2));

        Point A = new Point(1, 1);
		Point B = new Point(1, 4);
		Point C = new Point(5, 1);
		Triangle tr = new Triangle(A, B, C);
		System.out.println(tr.isValid());
		System.out.println(tr.perimeter());
		System.out.println(tr.area());

        // Point A = new Point(1, 1);
		// Point B = new Point(2, 2);
		// Point C = new Point(3, 3);
		// Triangle tr = new Triangle(A, B, C);
		// System.out.println(tr.isValid());
		// System.out.println(tr.perimeter());
		// System.out.println(tr.area());

        // Point A = new Point(1, 1);
		// Point B = new Point(9, 9);
		// Point C = new Point(10, 10);
		// Triangle tr = new Triangle(A, B, C);
		// System.out.println(tr.isValid());
		// System.out.println(tr.perimeter());
		// System.out.println(tr.area());

    }

}

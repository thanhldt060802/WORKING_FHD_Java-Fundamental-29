import entity.Member;
import entity.Project;
import operator.MemberOperator;
import operator.ProjectOperator;

public class Main {

    public static void main(String[] args) {

        Member m1 = new Member("001", "A1", "Backend");
        Member m2 = new Member("002", "A2", "Frontend");
        Member m3 = new Member("003", "A3", "Backend");
        Member m4 = new Member("004", "A4", "Fullstack");
        Member m5 = new Member("005", "A5", "System");
        Member m6 = new Member("006", "A6", "BA");
        Member m7 = new Member("007", "A7", "BA");
        Member m8 = new Member("008", "A8", "Frontend");
        Member m9 = new Member("009", "A9", "System");
        Member m10 = new Member("010", "A10", "Frontend");
        Member m11 = new Member("011", "A11", "Fullstack");
        Member m12 = new Member("012", "A12", "Frontend");
        Member m13 = new Member("013", "A13", "Backend");
        Member m14 = new Member("014", "A14", "Backend");
        Member m15 = new Member("015", "A15", "System");
        Member m16 = new Member("001", "A16", "System");

        Project p1 = new Project("P01", "ABC", 30000, 50);
        p1.getMemberList().add(m2);
        p1.getMemberList().add(m5);
        p1.getMemberList().add(m7);
        p1.getMemberList().add(m9);
        p1.getMemberList().add(m13);
        Project p2 = new Project("P02", "XYZ", 50000, 82);
        p2.getMemberList().add(m1);
        p2.getMemberList().add(m2);
        p2.getMemberList().add(m3);
        p2.getMemberList().add(m5);
        p2.getMemberList().add(m6);
        p2.getMemberList().add(m7);
        p2.getMemberList().add(m8);
        p2.getMemberList().add(m10);
        Project p3 = new Project("P03", "DEF", 25000, 75);
        p3.getMemberList().add(m1);
        p3.getMemberList().add(m4);
        p3.getMemberList().add(m11);
        p3.getMemberList().add(m12);
        p3.getMemberList().add(m13);
        p3.getMemberList().add(m2);
        p3.getMemberList().add(m5);
        p3.getMemberList().add(m4);
        p3.getMemberList().add(m7);

        MemberOperator mo = new MemberOperator();
        mo.add(m1);
        mo.add(m2);
        mo.add(m3);
        mo.add(m4);
        mo.add(m5);
        mo.add(m6);
        mo.add(m7);
        mo.add(m8);
        mo.add(m9);
        mo.add(m10);
        mo.add(m11);
        mo.add(m12);
        mo.add(m13);
        mo.add(m14);
        mo.add(m15);
        mo.add(m16);

        // mo.showAll();

        // mo.update(new Member("010", "X", "BA"));

        // System.out.println("After updating:");
        // mo.showAll();

        // mo.remove(new Member("010"));

        // System.out.println("After deleting:");
        // mo.showAll();

        // System.out.println("After searching: " + mo.search(new Member("010")));

        ProjectOperator po = new ProjectOperator();
        po.add(p1);
        po.add(p2);
        po.add(p3);

        // po.showAll();

        mo.setPo(po);
        po.setMo(mo);

    }

}

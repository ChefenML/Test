public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5);
        t1.showInfo();

        System.out.println();

        Triangle t2 = new Triangle(6, 6, 6);
        t2.showInfo();
        double areal1 = t1.getArea();
        double areal2 = t2.getArea();

        System.out.println("Hvilken er størst Trekant#1 eller Trekant#2");
        if (areal1 > areal2) {
            System.out.println("T1 er større!");
        } else {
            System.out.println("T2 er Større!");
        }
    }

}

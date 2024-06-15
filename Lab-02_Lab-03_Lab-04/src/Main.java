public class Main {
    public static void main(String[] args) {

        Point3D p1 = new Point3D(3,5,6);
        Point3D p2 = new Point3D(6,3,6);
        Point3D p3 = new Point3D(3,5,2);

        Rectangle3D r1 = new Rectangle3D(p1,p2,p3);
        System.out.println(r1.getVolume());
    }
}

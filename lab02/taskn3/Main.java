public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(2, 3);

        try {
            Triangle triangle = new Triangle(p1, p2, p3);
            System.out.println("perimeter of triangle: " + triangle.perimeter());
            System.out.println("area of triangle: " + triangle.area());
            Point centroid = triangle.centroid();
            System.out.println("centroid of triangle: (" + centroid.x + ", " + centroid.y + ")");
        } catch (IllegalArgumentException e) {
            System.out.println("error :(: " + e.getMessage());
        }
    }
}
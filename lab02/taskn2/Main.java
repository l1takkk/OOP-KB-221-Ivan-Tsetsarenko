public class Main {
    public static void main(String[] args) {
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(3, 4);
        Segment segment = new Segment(startPoint, endPoint);
        System.out.println("length of the segment: " + segment.length());
        System.out.println("midpoint of the segment: " + segment.middle());
        Segment anotherSegment = new Segment(new Point(2, 0), new Point(2, 5));
        Point intersectionPoint = segment.intersection(anotherSegment);
        if (intersectionPoint != null) {
            System.out.println("point of segments: " + intersectionPoint);
        } else {
            System.out.println("segments do not intersect.");
        }
    }
}
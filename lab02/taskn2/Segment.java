public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(Point startPoint, Point endPoint) {
        if (startPoint.equals(endPoint)) {
            throw new IllegalArgumentException("The start and end of a segment cannot be the same point.");
        }

        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double length() {
        return startPoint.distanceTo(endPoint);
    }

    public Point middle() {
        double middleX = (startPoint.getX() + endPoint.getX()) / 2.0;
        double middleY = (startPoint.getY() + endPoint.getY()) / 2.0;
        return new Point(middleX, middleY);
    }

    public Point intersection(Segment another) {
        double x1 = startPoint.getX();
        double y1 = startPoint.getY();
        double x2 = endPoint.getX();
        double y2 = endPoint.getY();
        double x3 = another.startPoint.getX();
        double y3 = another.startPoint.getY();
        double x4 = another.endPoint.getX();
        double y4 = another.endPoint.getY();

        double dx1 = x2 - x1;
        double dy1 = y2 - y1;
        double dx2 = x4 - x3;
        double dy2 = y4 - y3;
        double dx = x1 - x3;
        double dy = y1 - y3;

        double crossProduct = dx1 * dy2 - dy1 * dx2;

        if (Math.abs(crossProduct) < 1e-10) {
            return null;
        }

        double t1 = (dx * dy2 - dy * dx2) / crossProduct;
        double t2 = (dx * dy1 - dy * dx1) / crossProduct;

        if (t1 >= 0.0 && t1 <= 1.0 && t2 >= 0.0 && t2 <= 1.0) {
            double x = x1 + t1 * dx1;
            double y = y1 + t1 * dy1;
            return new Point(x, y);
        } else {
            return null;
        }
    }
}
class Triangle {
    Point p1, p2, p3;
    
    Triangle(Point p1, Point p2, Point p3) {
        if (isDegenerate(p1, p2, p3)) {
            throw new IllegalArgumentException("triangle is degenerate");
        }
        
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    boolean isDegenerate(Point p1, Point p2, Point p3) {
        return (p2.y - p1.y) * (p3.x - p2.x) == (p3.y - p2.y) * (p2.x - p1.x);
    }

    double sideLength(Point p1, Point p2) {
        return Math.hypot(p2.x - p1.x, p2.y - p1.y);
    }

    double perimeter() {
        return sideLength(p1, p2) + sideLength(p2, p3) + sideLength(p3, p1);
    }

    double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - sideLength(p1, p2)) * (s - sideLength(p2, p3)) * (s - sideLength(p3, p1)));
    }

    Point centroid() {
        return new Point((p1.x + p2.x + p3.x) / 3, (p1.y + p2.y + p3.y) / 3);
    }
}

package main;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        records();
        patternMatching();
    }

    // JEP 395: Records
    private static void records() {
        // Java 16より前の書き方
        Point1 point1 = new Point1(1, 2);
        System.out.println(point1.x());
        System.out.println(point1.y());

        // Java 16以降の書き方
        Point2 point2 = new Point2(3, 4);
        System.out.println(point2.x());
        System.out.println(point2.y());
    }

    // JEP 394: Pattern Matching for instanceof
    private static void patternMatching() {
        // Java 16より前の書き方
        Object obj1 = "hoge";
        if (obj1 instanceof String) {
            String s = (String) obj1;
            System.out.println(s);
        }

        // Java 16以降の書き方
        Object obj2 = "fuga";
        if (obj2 instanceof String s) {
            System.out.println(s);
        }
    }
}

// Java 16より前の書き方
class Point1 {
    private final int x;
    private final int y;

    Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x() { return x; }
    int y() { return y; }

    public boolean equals(Object o) {
        if (!(o instanceof Point1)) return false;
        Point1 other = (Point1) o;
        return other.x == x && other.y == y;
    }

    public int hashCode() {
        return Objects.hash(x, y);
    }

    public String toString() {
        return String.format("Point[x=%d, y=%d]", x, y);
    }
}

// Java 16以降の書き方
record Point2(int x, int y) { }
// 以下が展開される
//record Point(int x, int y) {
//    // Implicitly declared fields
//    private final int x;
//    private final int y;
//
//    // Other implicit declarations elided ...
//
//    // Implicitly declared canonical constructor
//    Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}

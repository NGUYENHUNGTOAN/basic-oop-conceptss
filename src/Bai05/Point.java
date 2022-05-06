package Bai05;

import java.util.Scanner;

public class Point {
    public static Point[] str = new Point[3];

    private double x;
    private double y;
    public Point() {
        x = 0;
        y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p) {
        x = p.x;
        y = p.y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    @Override
    public java.lang.String toString() {
        return "Tọa độ{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public double khoangCach(Point p) {
        return Math.sqrt(Math.pow((this.x - p.x), 2) +
                Math.pow((this.y - p.y), 2));
    }
    public double khoangCach(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
    }
    public void toaDoDiem(){
        System.out.print("Nhập tọa độ trục X: ");
        setX(new Scanner(System.in).nextDouble());
        System.out.print("Nhập tọa độ trục Y: ");
        setY(new Scanner(System.in).nextDouble());
    }


    public static void luuDiem(Point p) {
        for (int i = 0; i < str.length; i++) {
            if (str[i] == null) {
                str[i] = p;
                break;
            }
        }
    }
    public static void kiemTra() {
        double a = str[0].khoangCach(str[1]);
        double b = str[1].khoangCach(str[2]);
        double c = str[2].khoangCach(str[0]);
        if ((a + b > c) && (a + c > b) && (b + c > a) &&
                (a > 0) && (b > 0) && (c > 0)) {
            if ((a == b) && (b == c)) {
                System.out.println("Là 3 đỉnh của một tam giác đều.");
            } else if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Là 3 đỉnh của một tam giác cân.");
            } else if ((c * c == a * a + b * b) ||
                    (b * b == a * a + c * c) ||
                    (a * a == b * b + c * c)) {
                System.out.println("Là 3 đỉnh của một tam giác vuông.");
            } else {
                System.out.println("Là 3 đỉnh của một tam giác thường.");
            }
        } else {
            System.out.println("Không thỏa mãn điều kiện của một tam giác bất kì.");
        }
    }
    public static void inToaDo() {
        for (int i = 0; i < str.length; i++) {
            if (str[i] == null) {
                continue;
            }
            System.out.print("Tọa độ điểm thứ " + (i + 1) + " : ");
            System.out.println(str[i]);
        }
    }
}
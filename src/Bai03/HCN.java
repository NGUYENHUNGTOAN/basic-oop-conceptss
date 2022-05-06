package Bai03;

import java.util.Scanner;

public class HCN {
    private double width;
    private double height;
    private String color;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

    public double tinhDienTich() {
        double dt = width * height;
        return dt;
    }

    public double tinhChuVi() {
        double cv = (width + height) * 2;
        return cv;
    }

    public void taoMoiHCN() {
        System.out.println("Nhập thông số hình chữ nhật.");
        System.out.print("Nhập chiều rộng: ");
        width = new Scanner(System.in).nextDouble();
        System.out.print("Nhập chiều dài: ");
        height = new Scanner(System.in).nextDouble();
        System.out.print("Nhập màu: ");
        color = new Scanner(System.in).nextLine();
    }
}

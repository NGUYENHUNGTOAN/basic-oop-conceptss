package Bai05;

import static Bai05.Point.*;

public class Main {


    public static void main(String[] args) {
        nhap();
        inToaDo();
        kiemTra();
    }
    public static void nhap() {
        System.out.println("Nhập vào ba điểm bất kì: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập điểm thứ: " +(i+1));
            Point p = new Point();
            p.toaDoDiem();
            luuDiem(p);
        }
    }
}
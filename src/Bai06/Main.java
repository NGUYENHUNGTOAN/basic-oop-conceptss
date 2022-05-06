package Bai06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        matrix a = new matrix();
        matrix b = new matrix();
        matrix kq1 = new matrix();
        matrix kq2 = new matrix();
        System.out.println("----MENU LỰA CHỌN-----");

        System.out.println("0. Nhập ma trận: ");
        System.out.println("1. Tính tổng, hiệu hai ma trận. ");
        System.out.println("2. Tính tích hai ma trận. ");
        System.out.println("3. Tìm ma trận chuyển vị.");
        System.out.println("4. Kết thúc chương trình.");
        System.out.println("------------------------");
        System.out.println("Xin mời nhập lựa chọn của bạn");
        n = in.nextInt();

        switch (n) {
            case 0:
                System.out.println("Nhập ma trận thứ nhất: ");
                a.input();
                System.out.println("Nhập ma trận thứ hai: ");
                b.input();
            case 1:

                System.out.println("Tổng của hai ma trận là: ");
                kq1 = a.add(b);
                if (kq1 != null) kq1.print();
                System.out.println("Hiệu của hai ma trận là: ");
                kq2 = a.sub(b);
                if (kq2 != null) kq2.print();
                break;

            case 2:
                System.out.println("Tích hai ma trận là: ");
                kq1 = a.mul(b);
                if (kq1 != null) kq1.print();
                break;

            case 3:
                System.out.println("Nhập một ma trận: ");
                a.input();
                System.out.println("Ma trận chuyển vị của ma trận vừa nhập là: ");
                kq1 = a.transpose();
                kq1.print();
                break;
            case 4:
                System.out.println("Thoát chương trình.");
                return;
        }
    }
}

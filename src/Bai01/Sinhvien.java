package Bai01;

import java.util.Scanner;

public class Sinhvien {
    private static Sinhvien[] sinhviens = new Sinhvien[100];
    private String maSV;
    private String tenSV;
    private String lopSV;
    private String khoaHoc;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getLopSV() {
        return lopSV;
    }

    public void setLopSV(String lopSV) {
        this.lopSV = lopSV;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "maSV='" + maSV + '\'' +
                ", tenSV='" + tenSV + '\'' +
                ", lopSV='" + lopSV + '\'' +
                ", khoaHoc='" + khoaHoc + '\'' +
                '}';
    }


    public static void inThongTinSV() {
        Sinhvien sv = new Sinhvien();
        sv.nhapThongTinSV();
        luuThongTinSV(sv);
        for (int i = 0; i < sinhviens.length; i++) {
            if (sinhviens[i] != null) {
                System.out.println(sinhviens[i]);
            }
        }
    }
    private static void luuThongTinSV(Sinhvien sv) {
        for (int i = 0; i < sinhviens.length; i++) {
            if (sinhviens[i] == null) sinhviens[i] = sv;
            break;
        }
    }

    private void nhapThongTinSV() {
        System.out.println("NHẬP THÔNG TIN SINH VIÊN:");
        System.out.print("Nhập mã sinh viên: ");
        maSV = new Scanner(System.in).nextLine();
        System.out.print("Nhập họ tên sinh viên: ");
        tenSV = new Scanner(System.in).nextLine();
        System.out.print("Nhập lớp học sinh viên: ");
        lopSV = new Scanner(System.in).nextLine();
        System.out.print("Nhập khóa học sinh viên: ");
        khoaHoc = new Scanner(System.in).nextLine();
    }
}
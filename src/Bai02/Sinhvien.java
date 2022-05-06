package Bai02;

import java.util.Scanner;

import static Bai02.Sinhvien.tenLopSV.luuLopSV;

public class Sinhvien {
    private static Sinhvien[] sinhviens = new Sinhvien[100];
    private static tenLopSV[] idSinhviens = new tenLopSV[100];
    private String maSV;
    private String tenSV;
    private String lopSV;
    private String khoaHoc;

    public static void chucNang() {
    }
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
    public void nhapThongTinSV() {
        System.out.print("Nhập mã sinh viên: ");
        this.maSV = new Scanner(System.in).nextLine();
        System.out.print("Nhập tên sinh viên: ");
        this.tenSV = new Scanner(System.in).nextLine();
        System.out.print("Nhập tên lớp của sinh viên: ");
        this.lopSV = new Scanner(System.in).nextLine();
        System.out.print("Nhập khóa học: ");
        this.khoaHoc = new Scanner(System.in).nextLine();
    }

    public static void nhapThongTinSVmoi() {
        System.out.print("Nhập số lượng sinh viên: ");
        int soSV = new Scanner(System.in).nextInt();
        for (int i = 0; i < soSV; i++) {
            System.out.println("Sinh viên thứ: " + (i + 1));
            Sinhvien sv = new Sinhvien();
            sv.nhapThongTinSV();
            luuThongTinSV(sv);
        }
    }
    public static void thongTinSV() {
        for (int i = 0; i < sinhviens.length; i++) {
            if (sinhviens[i] == null) {
                continue;
            }
            System.out.println(sinhviens[i]);
        }
    }
    private static void luuThongTinSV(Sinhvien sinhvien) {
        for (int i = 0; i < sinhviens.length; i++) {
            if (sinhviens[i] == null) {
                sinhviens[i] = sinhvien;
                break;
            }
        }
    }
    public static void sapXepTheoTenSV() {
        for (int i = 0; i < sinhviens.length - 1; i++) {
            for (int j = i + 1; j < sinhviens.length; j++) {
                if (sinhviens[i] != null && sinhviens[j] != null &&
                        sinhviens[i].getTenSV().toUpperCase().compareTo
                                (sinhviens[j].getTenSV().toUpperCase()) > 0) {
                    Sinhvien temp = sinhviens[i];
                    sinhviens[i] = sinhviens[j];
                    sinhviens[j] = temp;
                }
            }
        }
    }
    public static void nhapLopSV() {
        System.out.print("Nhập tên lớp của sinh viên: ");
        int soLopSV = new Scanner(System.in).nextInt();
        for (int i = 0; i < soLopSV; i++) {
            System.out.println("Tên lớp thứ " + (i + 1));
            tenLopSV lopSV = new tenLopSV();
            lopSV.nhapLopSV();
            luuLopSV(lopSV);
        }
    }
    public static void inSVtheoLop() {
        int count = 0;
        for (int i = 0; i < idSinhviens.length; i++) {
            if (idSinhviens[i] != null) {
                count++;
            }
        }
        int countSV = 0;
        for (int i = 0; i < sinhviens.length; i++) {
            if (sinhviens[i] != null) {
                countSV++;
            }
        }
        for (int i = 0; i < count; i++) {
            int count1 = 0;
            int count2 = 0;
            System.out.println("+ " + idSinhviens[i]);
            for (int j = 0; j < countSV; j++) {
                if (idSinhviens[i] != null && sinhviens[j] != null &&
                        idSinhviens[i].getLopSV().equals(sinhviens[j].getLopSV())) {
                    System.out.println(sinhviens[j]);
                    count2++;
                } else {
                    count1++;
                }
            }
            if ((count1 > 0) && (count2 == 0)) {
                System.out.println("lớp rỗng. ");
            }
        }
    }
    static class tenLopSV {
        private String lopSV;

        public String getLopSV() {
            return lopSV;
        }
        public void setLopSV(String lopSV) {
            this.lopSV = lopSV;
        }
        @Override
        public String toString() {
            return "tenLopSV{" +
                    "lopSV='" + lopSV + '\'' +
                    '}';
        }
        public void nhapLopSV() {
            System.out.print("Nhập tên lớp của sinh viên: ");
            lopSV = new Scanner(System.in).nextLine();
        }
        static void luuLopSV(tenLopSV lopSV) {
            for (int i = 0; i < idSinhviens.length; i++) {
                if (idSinhviens[i] == null) {
                    idSinhviens[i] = lopSV;
                    break;
                }
            }
        }
    }
}

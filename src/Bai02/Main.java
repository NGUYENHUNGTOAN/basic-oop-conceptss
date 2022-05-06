package Bai02;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       chucNang();

    }

    static void chucNang() {
        while (true) {
            danhMuc();
            int luaChon = -1;
            do {
                luaChon = new Scanner(System.in).nextInt();
                if (luaChon < 0 || luaChon > 6)
                    System.out.print("Xin mời nhập lựa chọn chức năng: ");
            }
            while (luaChon < 0 || luaChon > 6);
            switch (luaChon) {
                case 1:
                    Sinhvien.nhapThongTinSVmoi();
                    break;
                case 2:
                    Sinhvien.thongTinSV();
                    break;
                case 3:
                    Sinhvien.sapXepTheoTenSV();
                    Sinhvien.thongTinSV();
                    break;
                case 4:
                    Sinhvien.nhapLopSV();
                    break;
                case 5:
                    Sinhvien.inSVtheoLop();
                    break;
                case 6:
                    return;
            }
        }
    }

    static void danhMuc() {
        System.out.println("-----QUẢN LÝ SINH VIÊN-----");
        System.out.println("1.Nhập thông tin sinh viên.");
        System.out.println("2.In ra danh sách sinh viên");
        System.out.println("3.Sắp xếp danh sách sinh viên theo tên.");
        System.out.println("4.Nhập số lượng lớp sinh viên cần in ra.");
        System.out.println("5.In ra danh sách sinh viên theo lớp vừa nhập. ");
        System.out.println("6.Thoát chương trình");
        System.out.print("Xin mời nhập lựa chọn của bạn: ");

    }
}

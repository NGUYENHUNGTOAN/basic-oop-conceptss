package Bai03;

public class Main {
        public static void main(String[] args) {
            HCN hcn = new HCN();
            hcn.taoMoiHCN();
            System.out.println(hcn.toString());
            System.out.println("Diện tích hình chữ nhật: " + hcn.tinhDienTich());
            System.out.println("Chu vi hình chữ nhật: " + hcn.tinhChuVi());
        }

}

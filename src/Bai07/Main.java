package Bai07;

public class Main {

    public static void main(String[] args) {
        Phanso s1= new Phanso();
        Phanso s2= new Phanso();
        System.out.println("Nhập phân số thứ nhất S1: "); s1.nhap();
        System.out.println("Nhập phân số thứ hai S2: "); s2.nhap();
        System.out.print("Phân số thứ nhất S1 đưa về tối giản: "); s1.toiGian().inPhanSo();
        System.out.print("Phân số thứ hai S2 đưa về tối giản: ");s2.toiGian().inPhanSo();
        System.out.print("Tổng hai phân số S1 + S2 = ");s1.cong(s2).toiGian().inPhanSo();
        System.out.print("Hiệu hai phân số S1 - S2 = ");if(s1.tru(s2).getTs()==0) System.out.println("0"); else s1.tru(s2).toiGian().inPhanSo();
        System.out.print("Tích hai phân số S1 * S2 = ");s1.nhan(s2).toiGian().inPhanSo();
        System.out.print("Thương hai phân số S1/S2 = ");s1.chia(s2).toiGian().inPhanSo();
        System.out.print("So sánh hai phân số: ");
        if(s1.lonHon(s2)) System.out.println("S1 > S2");
        if(s1.nhoHon(s2)) System.out.println("S1 < S2");
        if(s1.bangNhau(s2)) System.out.println(" S1 = S2");

    }
}

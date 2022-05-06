package Bai04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Mypoint[] p = new Mypoint[100];
        int n, h = 0, k = 0;
        double x, y, max = 0;
        System.out.print("Nhập số tọa độ: ");
        n = new Scanner(System.in).nextInt();
        for(int i = 1; i <= n; i++){
            p[i]= new Mypoint();
            System.out.println("Tọa độ điểm "+i+": ");
            System.out.print("X = ");
            x = new Scanner(System.in).nextDouble();
            p[i].setX(x);
            System.out.print("Y = ");
            y = new Scanner(System.in).nextDouble();
            p[i].setY(y);
        }

        for(int i=1;i<n;i++)
            for(int j=i+1;j<=n;j++)
                if(p[i].distance(p[j])>max) {
                max=p[i].distance(p[j]);
                h=i;
                k=j;
            }
        System.out.println("Khoảng cách lớn nhất giữa hai điểm: "+h+" và "+k+" là: "+max+"");
    }
}

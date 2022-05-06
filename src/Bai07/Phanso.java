package Bai07;

import java.util.Scanner;

public class Phanso {

        private int ts;
        private int ms;
        Scanner sc = new Scanner(System.in);
        public Phanso(){
            this.ts=0;
            this.ms=1;
        }

        public Phanso(int ts, int ms) {
            this.ts = ts;
            this.ms = ms;
        }

        public int getTs() {
            return ts;
        }

        public void setTs(int ts) {
            this.ts = ts;
        }

        public int getMs() {
            return ms;
        }

        public void setMs(int ms) {
            this.ms = ms;
        }
        public Phanso cong(Phanso sp2){
            Phanso kq= new Phanso();
            kq.ts= this.ts*sp2.ms+ sp2.ts*this.ms;
            kq.ms= this.ms*sp2.ms;
            return kq;
        }
        public Phanso tru(Phanso sp2){
            Phanso kq= new Phanso();
            kq.ts= this.ts*sp2.ms- sp2.ts*this.ms;
            kq.ms= this.ms*sp2.ms;
            return kq;
        }
        public Phanso nhan(Phanso sp2){
            Phanso kq= new Phanso();
            kq.ts= this.ts*sp2.ts;
            kq.ms= this.ms*sp2.ms;
            return kq;
        }

        public Phanso chia(Phanso sp2){
            Phanso kq= new Phanso();
            kq.ts= this.ts*sp2.ms;
            kq.ms= this.ms*sp2.ts;
            return kq;
        }
        public Phanso nghichDao(){
            Phanso kq= new Phanso();
            kq.ts= this.ms;
            kq.ms= this.ts;
            return kq;
        }
        public Phanso doiDau(Phanso sp2){
            Phanso kq= new Phanso();
            kq.ts= -this.ts;
            kq.ms= this.ms;
            return kq;
        }
        public int ucln(int a, int b){
            a= Math.abs(a); b= Math.abs(b);
            if(a==b) return a;
            if(a>b) return ucln(a-b,b);
            else return ucln(a,b-a);
        }
        public Phanso toiGian(){
            Phanso kq= new Phanso();
            int n= ucln(this.ts, this.ms);
            kq.ts= this.ts/n;
            kq.ms= this.ms/n;
            return kq;
        }

        public boolean bangNhau(Phanso sp2){
            if((float)this.ts/(float)this.ms==(float)sp2.ts/(float)sp2.ms)
                return true;
            return false;
        }
        public boolean nhoHon(Phanso sp2){
            if((float)this.ts/(float)this.ms<(float)sp2.ts/(float)sp2.ms)
                return true;
            return false;
        }
        public boolean lonHon(Phanso sp2){
            if((float)this.ts/(float)this.ms>(float)sp2.ts/(float)sp2.ms)
                return true;
            return false;
        }
        public void inPhanSo(){
            System.out.println(this.ts+"/"+this.ms);
        }
        public void nhap(){
            System.out.print("Tử số = ");
            ts= sc.nextInt();
            System.out.print("Mẫu số = ");
            ms=sc.nextInt();
        }
    }


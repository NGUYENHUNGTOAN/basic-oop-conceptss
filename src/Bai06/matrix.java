package Bai06;

import java.util.Scanner;

public class matrix {
    private int row = 100, col = 100;
    private float a[][]= new float[row][col];
    Scanner in= new Scanner(System.in);

    public matrix() {
        this.row=3;
        this.col=3;
    }

    public matrix(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public matrix add(matrix m){
        matrix kq= new matrix(this.row, this.col);

        if(this.row!=m.row||this.col!=m.col) {
            System.out.println("Hai ma trận không cộng được.");
            return null;
        }
        else
            for(int i=1;i<=row;i++)
                for(int j=1;j<=col;j++){
                    kq.a[i][j]=this.a[i][j]+m.a[i][j];
                }

        return kq;

    }

    public matrix sub(matrix m){
        matrix kq= new matrix(this.row, this.col);
        kq.col= this.col;
        kq.row= this.row;
        if(this.row!=m.row||this.col!=m.col) {
            System.out.println("Hai ma trận không trừ được.");
            return null;
        }
        else
            for(int i=1;i<=row;i++)
                for(int j=1;j<=col;j++){
                    kq.a[i][j]=m.a[i][j]-this.a[i][j];
                }

        return kq;

    }

    public matrix neg(){
        matrix kq= new matrix();
        for(int i=1;i<=row;i++)
            for(int j=1;j<=col;j++)
                kq.a[i][j]=- this.a[i][j];
        return kq;
    }

    public matrix mul(matrix m){
        matrix kq= new matrix(m.row, this.col);
        if(m.col!=this.row){
            System.out.println("Hai ma trận không nhân được.");
            return null;
        }
        else
            for(int i=1;i<=m.row;i++)
                for(int j=1;j<=this.col;j++){
                    for(int k=1;k<=m.col;k++) kq.a[i][j]+= m.a[i][k]*this.a[k][j];
                }
        return kq;
    }
    public matrix transpose(){
        matrix m= new matrix();
        m.row= this.col;
        m.col= this.row;
        for(int i=1;i<=this.col;i++) {
            for(int j=1;j<=this.row;j++) {
                m.a[i][j]=this.a[j][i];
            }
        }
        return m;

    }

    public void print(){

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("   "+a[i][j]);
            }
            System.out.println("");
        }

    }

    public void input(){
        System.out.print("Nhập số hàng: "); this.row= in.nextInt();
        System.out.print("Nhập số cột: "); this.col= in.nextInt();
        for(int i=1;i<=row;i++)
            for(int j=1;j<=col;j++){
                System.out.print("a["+i+"]["+j+"]= "); a[i][j]= in.nextFloat();
            }
        System.out.println("");
    }
}

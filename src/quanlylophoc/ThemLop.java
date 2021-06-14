package quanlylophoc;

import java.util.Scanner;

public class ThemLop {
    //đặt tên phương thức trùng với tên class được ko?
    public static Lop[] khoiTaoLop(Lop[] arr ){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập ID Của Lớp");
        int id= scanner.nextInt();
        System.out.println("Nhập tên của lớp");
        String name= scanner.next();
        Lop lop= new Lop(id,name);

        Lop[] arrNew= new Lop[arr.length+1];
        for(int i=0;i< arr.length;i++){
            arrNew[i]= arr[i];
        }
        arrNew[arrNew.length-1]=lop;
        return arrNew;

    }
}

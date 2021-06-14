package quanlylophoc;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class QuanLyHocSinhLop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Lop[] lops= new Lop[1];
        lops[0]= new Lop();
        Student[] students= new Student[0];
        do{
            System.out.println("1. Thêm Lớp");
            System.out.println("2. Hiển thị thông tin lớp");
            System.out.println("3. Thêm học sinh");
            System.out.println("4. Sửa học sinh");// chưa làm dc
            System.out.println("5. Xóa học sinh");// chưa làm được
            System.out.println("6. Hiển thị học sinh ");
            System.out.println("0. Exit Chương Trình");
            int luaChon= sc.nextInt();
            switch(luaChon){
                case 1:
                    lops= ThemLop.khoiTaoLop(lops);
                    break;
                case 2:

                    for (Lop element: lops) {
                        System.out.println(element);
                    }
                    break;
                case 3:
                    students=ThemStudent.khoiTaoStudent(students);
                    break;

                case 6:
                    for(Student elementHocSinh: students){
                        System.out.println(elementHocSinh);
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}

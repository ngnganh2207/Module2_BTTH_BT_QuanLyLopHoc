package quanlylophoc;

import java.util.Scanner;

public class ThemStudent {
    public static Student[] khoiTaoStudent(Student[] arr){
        Scanner scanner= new Scanner(System.in);
        Student[] arrNew= new Student[arr.length+1];
        System.out.println("Nhập ID Của Học Sinh");
        int id = scanner.nextInt();
        System.out.println(" Nhập Name của Học Sinh");
        String name = scanner.next();
        System.out.println(" Nhập Gender Của Học Sinh");
        String gender = scanner.next();
        System.out.println("Nhập Age Của Học Sinh");
        int age = scanner.nextInt();
        System.out.println("Nhập lớp của học sinh");
        System.out.println("Nhập ID của lớp ");
        int idLop = scanner.nextInt();
        System.out.println("Nhập tên của lớp ");
        String nameLop = scanner.next();
        Lop lop = new Lop(idLop, nameLop);
        Student student= new Student(id,name,gender,age,lop);
        for(int i=0;i< arr.length;i++){
            arrNew[i]=arr[i];
        }
        arrNew[arrNew.length-1]= student;
        return arrNew;
    }

}

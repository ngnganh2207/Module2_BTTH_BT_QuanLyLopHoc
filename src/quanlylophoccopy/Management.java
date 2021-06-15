package quanlylophoccopy;

import java.util.Scanner;

public class Management {
    public static Lop[] addClass(Lop[] arr){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Add new class");
        System.out.println("Input ID");
        int id= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input class name");
        String name= scanner.nextLine();
        Lop lop= new Lop(id,name);
        Lop[] newLop= new Lop[arr.length+1];
        for(int i=0; i< arr.length;i++){
            newLop[i]= arr[i];
        }
        newLop[newLop.length-1]= lop;
        return newLop;
    }
    public static Student[] addStudent(Student[] arr, Lop[] lop){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Add New Student");
        System.out.println("Input ID");
        int id= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input Name");
        String name= scanner.nextLine();
        System.out.println("Input Gender");
        String gender= scanner.nextLine();
        System.out.println("Input Age");
        int age= scanner.nextInt();
        System.out.println(" Choose your Class ID");
        for(Lop l: lop){
            System.out.println(l);
        }
        int classID= scanner.nextInt();
        Lop chooseLop= null;
        for(int i=0; i<lop.length;i++){
            if( classID==lop[i].getId()){
                break;
            }else {
                System.out.println("Không tồn tại ID Class này");
            }
        }
        Student[] newStudent= new Student[arr.length+1];
        Student student= new Student(id,name,gender,age,lop[id]);
        for(int i=0; i<arr.length;i++){
            newStudent[i]= arr[i];
        }
        newStudent[newStudent.length-1]=student;
        return newStudent;
    }
    public static Student[] delete(Student[] arr){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Student ID to delete");
        int id= scanner.nextInt();
        Student[] newStudents= new Student[arr.length-1];
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getId()==id){
              a=i;
                break;
            }
        }
        for(int j=0; j<a;j++) {
            newStudents[j] = arr[j];
        }
        for (int k= a; k< newStudents.length; k++ ){
            newStudents[a]= arr[a+1];
        }
        return newStudents;
    }
}

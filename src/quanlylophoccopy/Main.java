package quanlylophoccopy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lop[] lop = new Lop[0];
        Student[] hocVien = new Student[0];
        int choice;
        while (true) {
            System.out.println("1.Lớp");
            System.out.println("2. Student");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(" What to do with Lớp");
                    System.out.println("1. Add");
                    System.out.println("2. show");
                    int select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            lop = Management.addClass(lop);
                            break;
                        case 2:
                            for (Lop l : lop) {
                                System.out.println(l);
                            }
                            break;
                    }
                case 2:
                    System.out.println("what to do with student ");
                    System.out.println("1. Add");
                    System.out.println("2. Change");
                    System.out.println("3. Delete");
                    System.out.println("4. Display");
                    System.out.println("5. Exit");
                    int select1 = scanner.nextInt();
                    switch (select1) {
                        case 1:
                            hocVien = Management.addStudent(hocVien, lop);
                        case 2:
                            System.out.println("Input Student ID");
                            int id = scanner.nextInt();
                            Student target = null;
                            for (int i = 0; i < hocVien.length; i++) {
                                if (id == hocVien[i].getId()) {
                                    target = hocVien[i];
                                    break;
                                }
                            }
                            System.out.println("What to Change?");
                            System.out.println("1.Name");
                            System.out.println("2.ID");
                            System.out.println("3.Gender");
                            System.out.println("4.Age");
                            int select2 = scanner.nextInt();
                            switch (select2) {
                                case 1:
                                    System.out.println("Input a new name");
                                    String nameNew = scanner.nextLine();
                                    target.setName(nameNew);
                                    break;
                                case 2:
                                    System.out.println("Input a new ID");
                                    int idNew = scanner.nextInt();
                                    target.setId(idNew);
                                    break;
                                case 3:
                                    System.out.println("Input a new Gender");
                                    String genderNew = scanner.nextLine();
                                    target.setGender(genderNew);
                                    break;
                                case 4:
                                    System.out.println(" Input a new Age");
                                    int ageNew = scanner.nextInt();
                                    target.setAge(ageNew);
                                    break;
                            }
                        case 3:
                            hocVien = Management.delete(hocVien);
                            break;
                        case 4:
                            for (Student s : hocVien) {
                                System.out.println(s);
                            }
                            break;
                        case 5:
                            System.exit(0);
                    }
                case 3:
                    System.exit(0);

            }
        }
    }
}

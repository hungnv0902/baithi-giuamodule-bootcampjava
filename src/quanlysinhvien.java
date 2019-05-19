import java.util.*;

public class quanlysinhvien {
    public static int length = 0;
    private static sinhvien student;
    public static sinhvien[] listSV = new sinhvien[100];
    public static void main(String[] args) {
        boolean status = true;
        int choise;
        Scanner input = new Scanner(System.in);
        do {
            showMenu();
            choise = input.nextInt();
            switch (choise) {
                case 1:
                    int id;
                    String name;
                    int age;
                    String address;
                    double gpa;
                    System.out.print("ID Student: ");
                    id = input.nextInt();
                    input.nextLine();
                    System.out.print("NAME Student: ");
                    name = input.nextLine();
                    System.out.print("AGE Student: ");
                    age = input.nextInt();
                    input.nextLine();
                    System.out.print("ADDRESS Student:  ");
                    address = input.nextLine();
                    System.out.print("GPA Student: ");
                    gpa = input.nextDouble();
                    sinhvien Student = new sinhvien(id,name, age, address, gpa);
                    addSinhvien(Student);
                    break;
                case 2:
                    editSinhvien();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    sortStudent();
                    break;
                case 5:
                    showStudent();
                    break;

            }
        } while (choise != 0);

    }
    private static void showMenu(){
        System.out.println("1. Add Student");
        System.out.println("2. Edit Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Sort Student");
        System.out.println("5. Show Student");
        System.out.println("0. Exit");
        System.out.println("Choice: ");
    }

    public static void addSinhvien(sinhvien sv){
        listSV[length] = sv;
        length ++;

    }

    private static void editSinhvien() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ID muon edit :");
        int failId = input.nextInt();
        int i;
        boolean check = false;
        for(i = 0; i < length; i ++){
            if(listSV[i].getId() == failId){
                check = true;
                break;
            }
        }

        if(check) {
            int newId;
            String newName;
            int newAge;
            String newAddress;
            double newGpa;
            System.out.println("Nhap vao ID moi : ");
            newId = input.nextInt();
            listSV[i].setId(newId);
            System.out.println("Ten moi : ");
            newName = input.nextLine();
            listSV[i].setName(newName);
            System.out.println("Tuoi moi : ");
            newAge = input.nextInt();
            listSV[i].setAge(newAge);
            System.out.println("Dia chi moi :");
            newAddress = input.nextLine();
            listSV[i].setAddress(newAddress);
            System.out.println("gpa moi :");
            newGpa = input.nextDouble();
            listSV[i].setGpa(newGpa);
        } else {
            System.out.println("ID khong hop le ");
        }

    }

    private static void deleteStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ID muon xoa :");
        int deleteId = input.nextInt();
        for(int j = 0; j < listSV.length ; j ++) {
            if(listSV[j].getId() == deleteId) {
                listSV[j] = listSV[j + 1];
                System.out.println("Xoa thanh cong");
                break;
            } else {
                System.out.println("ID khong hop le");
            }
        }
    }

    private static void sortStudent() {
        for(int i = 0; i < length; i ++) {
            for (int j = i + 1;j < length; j ++) {
                if(listSV[i].getGpa() > listSV[j].getGpa()) {
                    sinhvien tg = new sinhvien();
                    tg = listSV[i];
                    listSV[i] = listSV[j];
                    listSV[j] = tg;
                }
            }

        }
    }

    public static void showStudent( ){
        System.out.println("------------------------");
        for (int i=0;i<length;i++){
            System.out.println("\n");
            listSV[i].show();
        }
    }


}

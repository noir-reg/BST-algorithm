package trees;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class StudentList extends BST {

    Scanner sc = null;

    public StudentList() {
        super();
        sc = new Scanner(System.in);

    }

    public void add() {
        String code, name;
        int mark;
        System.out.println("Add new student");
        boolean proceed = false;
        do {
            System.out.println("Enter student code: ");
            code = sc.nextLine().toUpperCase();
            proceed = search(new Student(code)) != null;
            if (proceed == true) {
                System.out.println("This code is duplicated");
            }
        } while (proceed);
        do {
            System.out.println("Enter student name: ");
            name = sc.nextLine().trim();
            proceed = (name.length() == 0);
            if (proceed == true) {
                System.out.println("Can not be blank");
            }
        } while (proceed);
        do {
            System.out.println("Enter mark: ");
            mark = Integer.parseInt(sc.nextLine());

            if (mark < 0) {
                System.out.println("Can not be negative");
            }
        } while (mark < 0);

        Student stu = new Student(code, name, mark);
        insert(stu);

        System.out.println("This student is added");
    }

    public void remove() {

        String code;
        System.out.println("Enter student code");
        code = sc.nextLine().toUpperCase();

        if (search(new Student(code)) != null) {
            deleteByMerging(new Student(code));
            System.out.println("Student has been deleted");
        } else {
            System.out.println("Student doesn't exist");
        }

    }

    public void printAll() {
       if(isEmpty()){
           System.out.println("The tree is empty");
       }else{
            inorder();
       }
    }

    public void updateMark() {
        String code;
        System.out.println("Enter student code");
        code = sc.nextLine().toUpperCase();
        if (search(new Student(code)) != null) {
            Student stu =  (Student) search(new Student(code));
            int oldMark = stu.getMark();
            System.out.println("Old mark: " + oldMark);
            int newMark;
            do {
                System.out.println("Enter new mark");
                newMark = Integer.parseInt(sc.nextLine());
                if (newMark < 0) {
                    System.out.println("Mark can not be negative");
                }
            } while (newMark < 0);

            stu.setMark(newMark);
            System.out.println("Mark has been updated");
        } else {
            System.out.println("Student doesn't exist");
        }
    }

}

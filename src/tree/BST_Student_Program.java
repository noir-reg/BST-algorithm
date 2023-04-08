/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author Admin
 */
public class BST_Student_Program {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add("Add new student");
        menu.add("Remove a student");
        menu.add("Update mark");
        menu.add("Print all students");
        menu.add("Quit");
        

        StudentList list = new StudentList();
        int userChoice;
        do {
            userChoice = menu.getUSerChoice();
            switch (userChoice) {
                case 1:
                    list.add();
                    break;
                case 2:
                    list.remove();
                    break;
                case 3:
                    list.updateMark();
                    break;
                case 4:
                    list.printAll();
                    break;
            }

        } while (userChoice > 0 && userChoice < 5);
    }

}

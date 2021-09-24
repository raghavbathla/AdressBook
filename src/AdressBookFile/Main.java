package AdressBookFile;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");
        System.out.println("Enter 1 for add, 2 for edit, 3 for delete,4 for print, 5 for exit");
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        Contacts contacts = new Contacts();
while(flag){

    switch (sc.nextInt()){
        case 1:
            contacts.addData();
            break;
        case 2:
            System.out.println("Enter first name to edit");
            String nameToEdit = sc.nextLine();
            contacts.edit(nameToEdit);
            break;
        case 3:
            System.out.println("Enter first name to delete");
            String name = sc.nextLine();
            contacts.delete(name);
            break;
        case 4:
            contacts.showData();
            break;
        case 5:
            flag = false;
            break;
    }
}

    }
}

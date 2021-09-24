package AdressBookFile;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {
    ArrayList<Model> arrayList = new ArrayList<Model>();
Scanner scanner;

    public Contacts() {
        scanner = new Scanner(System.in);
    }

    public void addData(){
        System.out.println("Enter all the details");
        System.out.println("First Name");
        String fname = scanner.nextLine();
        System.out.println("Last Name");
        String lname = scanner.nextLine();
        System.out.println("Address");
        String address = scanner.nextLine();
        System.out.println("City");
        String city = scanner.nextLine();
        System.out.println("state");
        String state = scanner.nextLine();
        System.out.println("zip");
        String zip = scanner.nextLine();
        System.out.println("PhoneNumber");
        String phone = scanner.nextLine();
        System.out.println("Email");
        String email = scanner.nextLine();

        arrayList.add(new Model(fname,lname,address,city,state,zip,phone,email));
        System.out.println("Data added Successfully");

    }

public void showData(){
    for(int i =0 ;i<arrayList.size();i++){
        System.out.println(arrayList.get(i).getFirstName());
        System.out.println(arrayList.get(i).getLastName());
        System.out.println(arrayList.get(i).getAddress());
        System.out.println(arrayList.get(i).getCity());
        System.out.println(arrayList.get(i).getZip());
        System.out.println(arrayList.get(i).getState());
        System.out.println(arrayList.get(i).getPhoneNumber());
        System.out.println(arrayList.get(i).getEmail());

    }

}

public  void delete(String name)
{
for (int i =0; i<arrayList.size(); i++){
    if(arrayList.get(i).getFirstName()==name){
        arrayList.remove(i);
        System.out.println("Deleted Successful");
        break;
    }
}
}
    public void edit(String name){
        for (int i=0;i<arrayList.size();i++){
            if(arrayList.get(i).getFirstName()==name){
                System.out.println("Enter  the new  details");
                System.out.println("First Name");
                String fname = scanner.nextLine();
                System.out.println("Last Name");
                String lname = scanner.nextLine();
                System.out.println("Address");
                String address = scanner.nextLine();
                System.out.println("City");
                String city = scanner.nextLine();
                System.out.println("state");
                String state = scanner.nextLine();
                System.out.println("zip");
                String zip = scanner.nextLine();
                System.out.println("PhoneNumber");
                String phone = scanner.nextLine();
                System.out.println("Email");
                String email = scanner.nextLine();
                arrayList.set(i,new Model(fname,lname,address,city,state,zip,phone,email));
                System.out.println("Data updated successfully");
                break;
            }
        }

    }
}

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class Employee implements Serializable {
    int EmployeeNumber;
    String EmployeeName;
    int Salary;

    Employee(int EmployeeNumber, String EmployeeName, int Salary) {
        this.EmployeeNumber = EmployeeNumber;
        this.EmployeeName = EmployeeName;
        this.Salary = Salary;
    }

    public String toString() {
        return this.EmployeeNumber + " " + this.EmployeeName + " " + this.Salary;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) throws Exception {
        int choice = -1;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        File file = new File("aashish.data");
        ArrayList<Employee> al = new ArrayList<Employee>();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        ListIterator li = null;

        if (file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Employee>) ois.readObject();
            ois.close();
        }

        do {
            System.out.println("ENTER YOUR CHOICE :");
            System.out.println("1 - ADD");
            System.out.println("2 - READ");
            System.out.println("0 - EXIT");
            choice = sc1.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter number of employee.");
                    int no = sc1.nextInt();
                    for (int i = 0; i < no; i++) {
                        System.out.println("----------------------");
                        System.out.println("ENTER NUMBER: ");
                        int number = sc1.nextInt();
                        System.out.println("ENTER NAME");
                        String ename = sc2.nextLine();
                        System.out.println("ENTER SALARY");
                        int salary = sc1.nextInt();
                        System.out.println("----------------------");
                        al.add(new Employee(number, ename, salary));
                    }
                    oos = new ObjectOutputStream(new FileOutputStream(file));
                    oos.writeObject(al);
                    oos.close();
                    break;
                case 2:
                    System.out.println("----------------------");
                    li = al.listIterator();
                    while (li.hasNext()) {
                        System.out.println(li.next());
                    }
                    System.out.println("----------------------");
                    break;

            }
        } while (choice != 0);

    }
}

import java.util.*;
import java.util.Scanner;
public class Main{
    static Scanner userInput = new Scanner(System.in);
    static int options;
    static ArrayList<StaffMember> myarr = new ArrayList<>();

    static int index = 4;
    static void insert(){
            System.out.println("========== Type Employee ==========");
            System.out.println("1. Volunteer");
            System.out.println("2. SalariesEmployee");
            System.out.println("3. HourlyEmployee");
            System.out.println("4. Back");
            options = userInput.nextInt();
            switch (options) {
                case 1:
                    System.out.println("ID : " + index);
                    System.out.println("Name: ");
                    userInput.nextLine();
                    String volunteerName = userInput.nextLine();
                    System.out.println("Address: ");
                    String volunteerAddress = userInput.nextLine();
                    System.out.println("Salary: ");
                    double volunteerSalary = userInput.nextDouble();
                    myarr.add(new Volunteer(index,volunteerName,volunteerAddress,volunteerSalary));
                    index++;
                    break;
                case 2:
                    System.out.println("ID : " + index);
                    System.out.println("Name: ");
                    userInput.nextLine();
                    String salariedName = userInput.nextLine();
                    System.out.println("Address: ");
                    String salariedAddress = userInput.nextLine();
                    System.out.println("Salary: ");
                    double salariedSalary = userInput.nextDouble();
                    System.out.println("Bonus: ");
                    double salariedBonus = userInput.nextInt();
                    myarr.add(new SalariedEmployee(index,salariedName,salariedAddress,salariedSalary,salariedBonus));
                    index++;
                    break;
                case 3:
                    System.out.println("ID : " + index);
                    System.out.println("Name: ");
                    userInput.nextLine();
                    String hourlyName = userInput.nextLine();
                    System.out.println("Address: ");
                    String hourlyAddress = userInput.nextLine();
                    System.out.println("Salary: ");
                    int hourlyWork = userInput.nextInt();
                    System.out.println("Bonus: ");
                    double hourlyRate = userInput.nextDouble();
                    myarr.add(new HourlySalaryEmployee(index,hourlyName,hourlyAddress,hourlyWork,hourlyRate));
                    index++;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Sorry, Invalid Option.");
                }
        }
    static void display(){
        for (int i=0; i<myarr.size(); i++){
            System.out.println(myarr.get(i));
        }
    }
    static void update(){
        System.out.println("========== Update Employee ==========");
        System.out.println("Input ID: ");
        int updateId = userInput.nextInt();
        for ( StaffMember staff : myarr ) {
            if(updateId == staff.getId()){
                if ( staff instanceof Volunteer){
                    System.out.println("Name: ");
                    userInput.nextLine();
                    String updateName = userInput.nextLine();
                    System.out.println("Address: ");
                    String updateAddress = userInput.nextLine();
                    System.out.println("Salary: ");
                    double updateSalary = userInput.nextDouble();
                    myarr.set(updateId - 1, new Volunteer(updateId, updateName, updateAddress, updateSalary));
                } else if ( staff instanceof SalariedEmployee) {
                    System.out.println("Name: ");
                    userInput.nextLine();
                    String updateName = userInput.nextLine();
                    System.out.println("Address: ");
                    String updateAddress = userInput.nextLine();
                    System.out.println("Salary: ");
                    double updateSalary = userInput.nextDouble();
                    System.out.println("Bonus: ");
                    double updateBonus = userInput.nextDouble();
                    myarr.set(updateId - 1, new SalariedEmployee(updateId, updateName, updateAddress, updateSalary, updateBonus));
                } else {
                    System.out.println("Name: ");
                    userInput.nextLine();
                    String updateName = userInput.nextLine();
                    System.out.println("Address: ");
                    String updateAddress = userInput.nextLine();
                    System.out.println("Hour worked: ");
                    int updateHour = userInput.nextInt();
                    System.out.println("Rate: ");
                    double updateRate = userInput.nextDouble();
                    myarr.set(updateId - 1, new HourlySalaryEmployee(updateId, updateName, updateAddress, updateHour, updateRate));
                }
            }

        }
    }
    static void remove(){
        System.out.println("========== Remove Employee ==========");
        System.out.println("Input ID: ");
        int removeId = userInput.nextInt();
        boolean searcher = false;
        for (int i = 0; i<myarr.size(); i++){
            if ( myarr.get(i).getId() == removeId ){
                myarr.remove(i);
                System.out.println("Remove Employee Successfully.");
                searcher = true;
                break;
            }
        }
            if (!searcher){
                System.out.println("ID not found.");
            }
    }
    static void exit(){
        System.exit(0);
    }
    public static void main(String args[]){
        Volunteer volunteerStaff = new Volunteer(1, "Oudom", "PP", 300);
        myarr.add(volunteerStaff);
        SalariedEmployee salaryStaff = new SalariedEmployee(2, "Chheng", "PP", 500, 50);
        myarr.add(salaryStaff);
        HourlySalaryEmployee hourlyStaff = new HourlySalaryEmployee(3, "Panha", "PP", 50, 5);
        myarr.add(hourlyStaff);
        while (true){
            System.out.println("========== Staff Member ==========");
            System.out.println("1. Insert Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Exit");
            System.out.print("Choose Your Option:");
            options = userInput.nextInt();
            switch (options){
                case 1:
                    insert();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    exit();
                    break;
                default:
                    System.out.println("Sorry, Invalid Option.");
            }
        }


    }
}
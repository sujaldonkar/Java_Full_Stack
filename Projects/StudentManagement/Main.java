import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        StudentService studentservice=new StudentService();

        int choice;

        do{
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            
            switch(choice){
                case 1:
                    studentservice.addStudent();
                    break;
                case 2:
                    studentservice.displayStudents();
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }while(true);
    }
}

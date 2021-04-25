
import java.util.Scanner;


public class StudentManager {
    
    void addMoney(Student student){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("How much money do you want to add? : ");
        int money = sc.nextInt();
        student.setBalance(money + student.getBalance());
        System.out.println("Money added to your wallet!");
        System.out.println("Current balance : " + student.getBalance());
        
        
    }
    
}

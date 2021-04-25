
public class CourseManager {

    void buyCourse(Student student, Courses course) {

        if (student.getBalance() >= course.getPrice()) {
            System.out.println("Purchase Successful!");
            student.setBalance(student.getBalance() - course.getPrice());
        } 
        else {
            System.out.println("Your balance : " + student.getBalance());
            System.out.println("Balance is not enough.Add money and try again.");
        }
    }

}

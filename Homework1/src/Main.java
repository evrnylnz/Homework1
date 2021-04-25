
public class Main {

    public static void main(String[] args) {

        Courses javaCourse = new Courses("Java Course", "2 week long course", "Engin Demirog", 100);
        Courses pythonCourse = new Courses("Python Course", "1 month long course", "Engin Demirog", 150);

        Student evrenYalniz = new Student(355, "Evren", "evrn.ylnz@gmail.com", "123456");

        StudentManager studentManager = new StudentManager();
        CourseManager courseManager = new CourseManager();

        courseManager.buyCourse(evrenYalniz, javaCourse);
        
        /* Your balance : 0
           Balance is not enough.Add money and try again.
        */
        
        studentManager.addMoney(evrenYalniz);
        /*
        How much money do you want to add? : 200
        Money added to your wallet!
        Current balance : 200
        */
        
        courseManager.buyCourse(evrenYalniz, pythonCourse);

    }

}

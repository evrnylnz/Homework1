

public class Courses {
    
    private String courseName;
    private String courseDetail;
    private String instructor;
    private int price;

    public Courses(String courseName, String courseDetail, String instructor, int price) {
        this.courseName = courseName;
        this.courseDetail = courseDetail;
        this.instructor = instructor;
        this.price = price;
    }
    
    public String getCourseName() {
        return courseName;
    }

    public String getCourseDetail() {
        return courseDetail;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getPrice() {
        return price;
    }
    
    
}

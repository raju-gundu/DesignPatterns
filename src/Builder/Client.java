package Builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setRollNumber(21);
        builder.setName("Raju");
        builder.setGender("M");
        builder.setAge(20);
        Student student = new Student(builder);
        System.out.println(student.rollNumber);


    }
}

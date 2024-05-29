package BuilderProd;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder().setAge(20).setName("Raju").setGender("M").setRollNumber(21).build();

        System.out.println(student.rollNumber);


    }
}

package Builder;

public class Student {
    String name;
    int age;
    String gender;
    int rollNumber;

    public Student(Builder builder) {
            if(builder.getAge()<21){
                throw new IllegalArgumentException("Age must be greater than 21");
            }
            name = builder.getName();
            age = builder.getAge();
            gender = builder.getGender();
            rollNumber = builder.getRollNumber();
    }
}

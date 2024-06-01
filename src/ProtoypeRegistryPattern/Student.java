package ProtoypeRegistryPattern;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private double studentPSP;
    private String batch;
    private double AvgBatchPSP;

    public Student(){}
    public Student(Student student){
        this.age=student.age;
        this.name=student.name;
        this.studentPSP=student.studentPSP;
        this.batch=student.batch;
        this.AvgBatchPSP=student.AvgBatchPSP;
    }

    /*public int getAge(){
        return age;
    }*/
    public void setAge(int age){
        this.age = age;
    }
    /*public double getAvgBatchPSP(){
        return AvgBatchPSP;
    }*/
    public void setAvgBatchPSP(double AvgBatchPSP){
        this.AvgBatchPSP = AvgBatchPSP;
    }
    /*public String getName(){
        return name;
    }*/
    public void setName(String name){
        this.name = name;
    }
    /*public double getStudentPSP(){
        return studentPSP;
    }*/
    public void setStudentPSP(double studentPSP){
        this.studentPSP = studentPSP;
    }
    public String getBatch(){
        return batch;
    }
    public void setBatch(String batch){
        this.batch = batch;
    }



    @Override
    public Student clone(){
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", studentPsp=" + studentPSP +
                ", batch='" + batch + '\'' +
                ", avgBatchPsp=" + AvgBatchPSP +
                '}';
    }
}

package ProtoypeRegistryPattern;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        registerStudents(studentRegistry);

        Student raju = studentRegistry.get("aug_lld_student").clone();
        raju.setName("Raju");
        raju.setAge(24);
        raju.setStudentPSP(80.0);
        System.out.println(raju);

        Student xyz = studentRegistry.get("aug_lld_student").clone();
        xyz.setName("xyz");
        xyz.setStudentPSP(70.0);
        xyz.setAge(22);
        System.out.println(xyz);

        Student intelligentRaju = studentRegistry.get("intelligent_aug_lld_student").clone();
        intelligentRaju.setName("iRaju");
        intelligentRaju.setAge(29);
        intelligentRaju.setStudentPSP(100.0);
        System.out.println(intelligentRaju);
    }

    public static void  registerStudents(StudentRegistry studentRegistry) {
        Student augLldStudent = new Student();
        augLldStudent.setBatch("Aug_LLD_Student");
        augLldStudent.setAvgBatchPSP(90.0);
        studentRegistry.register("aug_lld_student",augLldStudent);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.iq = 140;
        intelligentStudent.setBatch("Aug batch");
        intelligentStudent.setAvgBatchPSP(90.0);
        studentRegistry.register("intelligent_aug_lld_student", intelligentStudent);
    }
}

package BuilderProd;

 class Student {
    String name;
    int age;
    String gender;
    int rollNumber;

    private Student(Builder builder) {
         name = builder.getName();
         age = builder.getAge();
         gender = builder.getGender();
         rollNumber = builder.getRollNumber();
    }
    public static Builder getBuilder(){
         return new Builder();
    }
    static class Builder {

     private int age;
     private String name;
     private String gender;
     private int rollNumber;

     public int getAge(){

         return age;
     }

     public String getName(){

         return name;
     }

     public String getGender(){

         return gender;
     }
     public int getRollNumber(){

         return rollNumber;
     }
     public Builder setAge(int age){

         this.age = age;
         return this;
     }
     public Builder setName(String name){

         this.name = name;
         return this;
     }
     public Builder setGender(String gender){

         this.gender = gender;
         return this;
     }
     public Builder setRollNumber(int rollNumber){

         this.rollNumber = rollNumber;
         return this;
     }
     public Student build(){
         if(this.getAge()<21){
             throw new IllegalArgumentException("Age must be greater than 21");
         }
         return new Student(this);
     }

     }
}

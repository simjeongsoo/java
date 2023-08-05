package ReferenceTypeSource;

public class Student { //DTO or VO
    String name;
    String address;
    String phone;
    String email;
    public Student(String name){
        this.name=name;
    }
    public Student(String name, String address, String phone, String email){
//        super();
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
//    @Override
//    public String toString(){
//        return name+" "+address+" "+phone+" "+email;
//    }

    @Override
    public String toString() {
        return "ReferenceTypeSource.Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


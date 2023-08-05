package objectsource;

import java.util.Objects;

public class Student {
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
    //==============================================================================================================
    /*
    * hashCode() 를 equals() 와 함께 재정의하지 않으면 코드가 예상과 다르게 작동하는 위와 같은 문제를 일으킴
    * 정확히 말하면 hash 값을 사용하는 Collection(HashSet, HashMap, HashTable)을 사용할 때 문제가 발생
    *   -> hashCode 메서드의 리턴 값이 우선 일치하고 equals 메서드의 리턴 값이 true 여야 논리적으로 같은 객체라고 판단
    * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(address, student.address) && Objects.equals(phone, student.phone) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phone, email);
        /*
        * Objects.hash 메서드는 hashCode 메서드를 재정의하기 위해 간편히 사용할 수 있는 메서드이지만 속도가 느림
        * 인자를 담기 위한 배열이 만들어지고 인자 중 기본 타입이 있다면 박싱과 언박싱의 과정 필요
        * 성능에 아주 민감하지 않은 대부분의 프로그램은 간편하게 Objects.hash 메서드를 사용해서 hashCode 메서드를 재정의해도 문제 없음
        * 민감한 경우에는 직접 재정의해주는 게 좋음
        * */
    }
    //==============================================================================================================
}

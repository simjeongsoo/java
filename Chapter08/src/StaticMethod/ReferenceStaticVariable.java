package StaticMethod;

public class ReferenceStaticVariable {
    String name; // 클래스 변수 , 전역변수처럼 동작

    public ReferenceStaticVariable(){}; // 기본 생성자

    public ReferenceStaticVariable(String name){ // name 을 받는 생성자
        this.name=name;
    }

    public static void main(String[] args) {
        ReferenceStaticVariable referenceStaticVariable = new ReferenceStaticVariable(); // 객체생성
        referenceStaticVariable.checkName();
    }

    public void checkName(){
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("Sangmin");
        System.out.println(reference1.name);

        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("sungchoon");
        System.out.println(reference1.name);
    }

}

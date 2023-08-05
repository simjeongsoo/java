public class Profile { // 클래스
    String name = "";
    int age = 0;
    
    //public Profile(){} //기본 생성자(자동 생성)

    //메소드
    public void setName(String str){
        name = str;
    }
    public void setAge(int val){
        age = val;
    }
    public void printName(){
        System.out.println("My name is "+name);
    }
    public void printAge() {
        System.out.println("My age is "+age);
    }
    //main
    public static void main(String[] args){
        //객체 생성, 생성자 호출
        Profile profile = new Profile();

        //메소드 사용
        profile.setName("Min");
        profile.setAge(20);
        profile.printName();
        profile.printAge();

    }
}

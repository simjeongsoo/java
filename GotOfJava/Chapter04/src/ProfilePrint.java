public class ProfilePrint {
    //인스턴스 변수
    byte age; // 이름
    String name; // 나이
    boolean isMarried; // 결혼유무

    public static void main(String[] args){
        ProfilePrint profilePrint = new ProfilePrint(); // 객체 생성
        // 지역변수
        byte age = 10;
        String name = "java";
        boolean flag = true;

        profilePrint.setAge(age);
        profilePrint.setName(name);
        profilePrint.setMarried(flag);
        System.out.println(profilePrint.getAge());
        System.out.println(profilePrint.getName());
        System.out.println(profilePrint.isMarried());
    }

    // 나이 지정 메소드
    public void setAge(byte age){
        //this.age == 인스턴스 변수
        //age == 매개변수
        this.age = age;
    }
    // 나이 리턴 메소드
    public byte getAge() {
        return age;
    }

    // 이름 지정 메소드
    public void setName(String name){
        this.name = name;
    }
    // 이름 리턴 메소드
    public String getName(){
        return name;
    }

    // 결혼 여부 지정 메소드
    public void setMarried(boolean flag){
        this.isMarried = flag;
    }
    // 결혼 여부 리턴 메소드
    public boolean isMarried(){
        return isMarried;
    }
}

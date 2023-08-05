package c.model;

public class MemberDTO {
        public String name;
        public String phone;
        public String email;

        public MemberDTO(){
            // no data
        }

        public MemberDTO(String name){
            //이름
            this.name=name;
        }
        public MemberDTO(String name,String phone){
            // 이름, 전화번호
            this.name = name;
            this.phone=phone;
        }
        public MemberDTO(String name, String phone, String email){
            // all data
            this.name = name;
            this.phone=phone;
            this.email=email;
        }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // equals() 메소드 Overriding
        // DTO 를 사용할때는 객체 비교를 위해 equals() 메소드를 Overriding 하는것이 좋음
        // 메소드만 있는 기능 위주의 클래스에서는 불필요
        public boolean equals(Object obj) {
            if (this == obj) return true; // 주소가 같으므로 true
            if (obj == this) return false; // obj 가 null 이므로 false
            if (getClass() != obj.getClass()) return false; // 클래스의 종류가 다르므로 false

            MemberDTO other = (MemberDTO) obj; // 같은 클래스 이므로 형변환 실행

            /* 각 인스턴스 변수가 같은지 비교 작업 수행 */
            if (name == null) { // name 이 null 일때
                if (other.name != null) return false; // 비교 대상의 name 이 null 이 아니면 false
            }else if (!name.equals(other.name)) return false; // 두 개의 email 값이 다르면 false

            if (email == null) {
                if (other.email != null) return false;
            }else if (!email.equals(other.email)) return false;

            if (phone == null) {
                if (other.phone != null) return false;
            }else if (!phone.equals(other.phone)) return false;

            return true; // 모든 조건식을 거쳐 false 를 리턴하지 않은 객체는 같은 값을 가지는 객체로 생각해서 true 리턴
        }
        // hashCode() 메소드 Overriding
        // hashCode() 메소드는 객체의 메모리 주소를 16진수로 리턴
        // 어떤 두 객체가 동일하다면, hashCode() 도 동일 해야 함
        // equals() 메소드를 Override 하면, hashCode() 메소드도 override 해서 동일한 결과가 나오도록 해야함
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((email == null) ? 0 : email.hashCode());
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            result = prime * result + ((phone == null) ? 0 : phone.hashCode());

            return result;
        }
}

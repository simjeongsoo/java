package item17;

public final class Person {
    // Address의 참조가 final인 것이지 정보까지 final이 아니다.
    private final Address address; // 가변적인 컴포넌트

    public Person(Address address) {
        this.address = address;
    }

    // 내부의 가변적인 컴포넌트에 접근하는 방법을 제공하면 안된다.
//    public Address getAddress() {
//        return address;
//    }

    // 방어적 복사 수행
    public Address getAddress() {
        Address copyOfAddress = new Address();
        copyOfAddress.setCity(address.city);
        return copyOfAddress;
    }

    public static void main(String[] args) {
        Address seoul = new Address();
        seoul.setCity("Seoul");

        Person person = new Person(seoul);
        Address ansan = person.getAddress();

        // Person의 상태가 처음과 달라졌다.
        ansan.setCity("Ansan");

        // 방어적 복사를 수행함으로써 person은 불변클래스가 되었다.
        // result : Seoul
        System.out.println(person.address.getCity());

    }
}

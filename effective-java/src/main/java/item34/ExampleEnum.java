package item34;

public enum ExampleEnum {
    INSTANCE1(1),
    INSTANCE2(2);

    private static int sharedStaticField = 0;

    private int instanceField;

    ExampleEnum(int instanceField) {
        this.instanceField = instanceField;
//        System.out.println(this.instanceField);

        // 생성자에서는 정적 필드에 접근 불가
//        sharedStaticField += this.instanceField;
    }

    public static void main(String[] args) {
        // 열거 타입 상수를 사용하면 생성자가 호출됨
        ExampleEnum example1 = ExampleEnum.INSTANCE1;
        System.out.println(example1);
//        ExampleEnum example2 = ExampleEnum.INSTANCE2;
    }
}

package c.string;

public class StringNull {
    public static void main(String[] args) {
        StringNull sample = new StringNull();
        //sample.nullCheck(null);
        System.out.println(sample.nullCheck2(null));
    }

    public boolean nullCheck(String text) {
        int textLength = text.length(); // null check 없이 null 객체에 접근시 NullPointException 발생
        System.out.println(textLength);
        if (text==null) return true;
        else return false;
    }

    // 메소드의 매개변수로 넘어오는 객체가 널이 될 확률이 조금이라도 있다면 반드시 null check
    public boolean nullCheck2(String text) {
        if (text == null) { // null check
            return true;
        } else {
            int textLength = text.length();
            System.out.println(textLength);
            return false;
        }
    }
}

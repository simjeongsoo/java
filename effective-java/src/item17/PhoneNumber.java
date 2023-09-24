package item17;

/**
 * 불변 클래스에는 상속을 방지하도록 final 을 사용해야 한다.
 */
public final class PhoneNumber {
    private short areaCode, prefix, lineNum;

    // 생성자로 초기화된 객체는 변경할 수 없다.
    public PhoneNumber(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    public short getAreaCode() {
        return areaCode;
    }

    public short getPrefix() {
        return prefix;
    }

    public short getLineNum() {
        return lineNum;
    }
}

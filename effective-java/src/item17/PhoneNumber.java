package item17;

public class PhoneNumber {
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

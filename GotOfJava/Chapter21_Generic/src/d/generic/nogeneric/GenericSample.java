package d.generic.nogeneric;

public class GenericSample {


    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        sample.checkCastingDTO();

    }

    public void checkCastingDTO() {
        CastingDTO dto1 = new CastingDTO();
        dto1.setObject(new String());

        CastingDTO dto2 = new CastingDTO();
        dto2.setObject(new StringBuffer());

        CastingDTO dto3 = new CastingDTO();
        dto3.setObject(new StringBuilder());

        checkDTO(dto1);
        checkDTO(dto2);
        checkDTO(dto3);

        // getObject() 를 호출했을 때 리턴값으로 넘어오느 타입은 Object 타입 이기 때문 에 형변환 필요
        String temp1 = (String) dto1.getObject();
        StringBuffer temp2 = (StringBuffer) dto2.getObject();
        StringBuilder temp3 = (StringBuilder) dto3.getObject();

    }

    // instanceof 메소드로 타입 체크 메소드
    public void checkDTO(CastingDTO dto) {
        Object tempObject = dto.getObject();
        if (tempObject instanceof StringBuilder) {
            System.out.println("StringBuilder");
        } else if (tempObject instanceof StringBuffer) {
            System.out.println("StringBuffer");
        } else if (tempObject instanceof String) {
            System.out.println("String");
        }
    }
}

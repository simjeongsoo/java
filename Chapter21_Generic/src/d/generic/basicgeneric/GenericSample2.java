package d.generic.basicgeneric;

public class GenericSample2 {
    public static void main(String[] args) {
        GenericSample2 sample2 = new GenericSample2();
        sample2.checkGenericDTO();
    }

    private void checkGenericDTO() {
        CastingGenericDTO<String> dto1 = new CastingGenericDTO<String>();
        dto1.setObject(new String());

        CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<StringBuffer>();
        dto2.setObject(new StringBuffer());

        CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<StringBuilder>();
        dto3.setObject(new StringBuilder());

        // Generic 타입의 객체를 가져올 때
        String temp1 = dto1.getObject();
        StringBuffer temp2 = dto2.getObject();
        StringBuilder temp3 = dto3.getObject();
    }
}

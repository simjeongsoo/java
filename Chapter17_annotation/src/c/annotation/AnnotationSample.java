package c.annotation;

public class AnnotationSample {

    @SuppressWarnings("deprecation")
    public void useDeprecated() {
        AnnotationDeprecated deprecated = new AnnotationDeprecated();
        deprecated.noMoreUse();
    }
}

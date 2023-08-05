package c.annotation;

public class UserAnnotationSample {
    @UserAnnotation(number = 0)
    public static void main(String[] args) {
        UserAnnotationSample sample = new UserAnnotationSample();
        sample.annotationSample1();
        sample.annotationSample2();
        sample.annotationSample3();
    }

    @UserAnnotation(number = 1)
    public void annotationSample1() {

    }

    @UserAnnotation(number = 2, text = "second")
    public void annotationSample2() {

    }

    @UserAnnotation(number = 3, text = "third")
    public void annotationSample3() {

    }
}

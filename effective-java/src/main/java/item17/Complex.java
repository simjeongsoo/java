package item17;

/**
 * 불변 복소수 클래스
 */
public class Complex {
    private final double re;
    private final double im;

    // 같은 인스턴스라면 상수로 선언해서 사용할 수 도 있다.
    public static final Complex ZERO = new Complex(0, 0);
    public static final Complex ONE = new Complex(1, 0);
    public static final Complex I = new Complex(0, 1);

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static class MyComplex extends Complex{
        private MyComplex(double re, double im) {
            super(re, im);
        }
    }

    // 생성자 대신 정적 팩터리를 사용한 불변 클래스 - 상속 불가(final 보다 유연함)
    public static Complex valueOf(double re, double im) {
        return new MyComplex(re, im);
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    public Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex times(Complex c) {
        return new Complex(
                re * c.re - im * c.im,
                re * c.im + im + c.re
        );
    }

    public Complex divideBy(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex(
                (re * c.re + im * c.im) / tmp,
                (im * c.re + re * c.im) / tmp
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Complex)) {
            return false;
        }
        Complex c = (Complex) obj;

        // == 대신 compare 사용 이유 -> 특수한 부동소수값을 다뤄야 함
        return Double.compare(c.re, re) == 0 && Double.compare(c.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}

package Data;

public class AnotherNumber extends ComplexNumber{
    public AnotherNumber(double realPart, double imaginaryPart) {
        super(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return "AnotherNumber{"+ getRealPart() + "}+{" + getImaginaryPart() + "}";
    }
}

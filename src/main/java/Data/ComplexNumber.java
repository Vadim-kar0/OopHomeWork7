package Data;

public class ComplexNumber {
    private double realPart;

    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {

        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double numerator) {
        this.realPart = numerator;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        if(imaginaryPart >= 0){
            return "ComplexNumber{"+ realPart + "+" + imaginaryPart + "i}";
        } else {
            return "ComplexNumber{" + realPart + imaginaryPart + "i}";
        }
    }
}

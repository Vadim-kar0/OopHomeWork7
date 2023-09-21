package Service;

import Data.ComplexNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberService implements NumberInterface {
    private List<ComplexNumber> complexNumbers;
    public NumberService() {
        this.complexNumbers = new ArrayList<>();
    }


    @Override
    public List<ComplexNumber> getAllComplexNumbers() {
        return complexNumbers;
    }


    @Override
    public void createCoupleComplexNumbers() {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        System.out.println("Введите действительную часть первого числа");
        x = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого числа");
        y = scanner.nextDouble();
        ComplexNumber complexNumber1 = new ComplexNumber(x, y);
        complexNumbers.add(complexNumber1);
        System.out.println("Введите действительную часть второго числа");
        x = scanner.nextDouble();
        System.out.println("Введите мнимую часть второго числа");
        y = scanner.nextDouble();
        ComplexNumber complexNumber2 = new ComplexNumber(x, y);
        complexNumbers.add(complexNumber2);
    }


    @Override
    public ComplexNumber addition(ComplexNumber x, ComplexNumber y) {
        ComplexNumber z = new ComplexNumber(0.0,0.0);
        z.setRealPart(x.getRealPart() + y.getRealPart());
        z.setImaginaryPart(x.getImaginaryPart() + y.getImaginaryPart());
        return z;
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber x, ComplexNumber y) {
        ComplexNumber z = new ComplexNumber(0.0,0.0);
        z.setRealPart(x.getRealPart() - y.getRealPart());
        z.setImaginaryPart(x.getImaginaryPart() - y.getImaginaryPart());
        return z;
    }

    @Override
    public ComplexNumber multiplication(ComplexNumber x, ComplexNumber y) {
        ComplexNumber z = new ComplexNumber(0.0,0.0);
        z.setRealPart((x.getRealPart() * y.getRealPart()) -
                (x.getImaginaryPart() * y.getImaginaryPart()));
        z.setImaginaryPart((x.getImaginaryPart() * y.getRealPart()) +
                (x.getRealPart() * y.getImaginaryPart()));
        return z;
    }

    @Override
    public ComplexNumber division(ComplexNumber x, ComplexNumber y) {
        ComplexNumber z = new ComplexNumber(0.0,0.0);
        z.setRealPart(((x.getRealPart() * y.getRealPart()) +
                (x.getImaginaryPart() * y.getImaginaryPart())) /
                ((y.getRealPart() * y.getRealPart()) + (y.getImaginaryPart()* y.getImaginaryPart())));
        z.setImaginaryPart((((x.getImaginaryPart() * y.getRealPart()) -
                (x.getRealPart() * y.getImaginaryPart())) /
                ((y.getRealPart() * y.getRealPart()) + (y.getImaginaryPart()* y.getImaginaryPart()))));
        return z;
    }
}































package Service;

import Data.ComplexNumber;

import java.util.List;

public interface NumberInterface {
    public List<ComplexNumber> getAllComplexNumbers();
    public void createCoupleComplexNumbers();
    public ComplexNumber addition(ComplexNumber x,ComplexNumber y);
   public ComplexNumber subtraction(ComplexNumber x, ComplexNumber y);
    public ComplexNumber multiplication(ComplexNumber x,ComplexNumber y);
    public ComplexNumber division(ComplexNumber x,ComplexNumber y);



}

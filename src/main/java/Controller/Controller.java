package Controller;

import Data.ComplexNumber;
import Service.NumberService;
import View.UserView;

import java.util.List;

public class Controller {

    NumberService numberService = new NumberService();
    UserView userView = new UserView();

    public void start() {
                numberService.createCoupleComplexNumbers();
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                userView.appendLog("workWithComplexNumbers");
    }



    private void workWithComplexNumbers(List<ComplexNumber> allComplexNumbers) {
        userView.set("""
                Выберете функцию:
                1 - сложить числа
                2 - вычесть первое число из второго
                3 - вычесть второе число из первого
                4 - перемножить числа
                5 - разделить первое число на второе
                6 - разделить второе число на первое
                7 - показать все введённые числа и ответы
                8 - ввести новые числа
                0 - выход
                """);
        userView.appendLog(numberService.getAllComplexNumbers());
        int answer = userView.get();
        List<ComplexNumber> list = numberService.getAllComplexNumbers();
        ComplexNumber complexNumber;
        switch (answer) {
            case 1:
                complexNumber = numberService.addition(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" addition Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                break;
            case 2:
                complexNumber = numberService.subtraction(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" subtraction Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                break;
            case 3:
                complexNumber = numberService.subtraction(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" subtraction Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                break;
            case 4:
                complexNumber = numberService.multiplication(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" multiplication Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                break;
            case 5:
                complexNumber = numberService.division(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" division Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                break;
            case 6:
                complexNumber = numberService.division(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" division Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                break;
            case 7:
                System.out.println(userView.log);
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                break;
            case 8:
                start();
                break;
            case 0:
                return;
            default:
                workWithComplexNumbers(numberService.getAllComplexNumbers());
        }


    }
}

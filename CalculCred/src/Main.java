import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму взятых в кредит денег ,ежемесячный платеж, процентная ставка, тип клиента через пробел");
        String n = sc.nextLine();                                             // Вводим строку
        String[] cond = n.split(" ", 5);                           // Переводим строку в массив и ограничиваем число задействованных элементов в массиве
        double sumD = Double.parseDouble(cond[0]);                            // Переводим элементы массива из типа String в тип double и обозначаем для дальнейших действий с ними
        double montmonD = Double.parseDouble(cond[1]);
        double persentD = Double.parseDouble(cond[2]);
        String person = cond[3];
        Calculator credit = new Calculator();
        if (sumD < 0)                                                          // Сумма кредита не отрицательная
            throw new IllegalArgumentException();
        else if (!(person.equals("business")) && !(person.equals("human"))) {   // Определяем тип клиента
            throw new IllegalArgumentException();
        } else {
            System.out.println(credit.calculat(sumD, montmonD, persentD, person));
        }


    }
}




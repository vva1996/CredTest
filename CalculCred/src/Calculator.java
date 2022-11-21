public class Calculator {
    public double calculat(double sumD, double montmonD, double persentD, String person) {
        double persenSum = 0;
        double persentBus = ((sumD - (montmonD * 12)) * (persentD / 100) / 12);           // Считаем сумму процентов для business
        double persentHum = (sumD * (persentD / 100) / 12);                               // Считаем сумму процентов для human
        if (person.equals("business")) {
            if (montmonD > persentBus) {

                do {
                    persenSum = persenSum + ((sumD - (montmonD * 12)) * (persentD / 100));
                    sumD = (sumD - (montmonD * 12)) + ((sumD - (montmonD * 12)) * (persentD / 100));

                } while ((sumD > 0) && (sumD > (montmonD * 12)));
            } else
                throw new IllegalArgumentException();

        } else {

            if (montmonD > persentHum) {                                          // Проверяем возможность выплаты клиента типа human
                do {
                    persenSum = persenSum + (sumD * (persentD / 100));           // Вычисляем сумму процентов
                    sumD = (sumD - (montmonD * 12)) + (sumD * (persentD / 100));
                } while ((sumD > 0) && (sumD > (montmonD * 12)));

            } else
                throw new IllegalArgumentException();
        }

        return persenSum;
    }

}


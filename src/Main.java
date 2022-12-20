import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        //Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».
        task2();
        // Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        task3();
        // Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        //Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней), и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        //Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
        task4();
        // В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов — char[ ].
        //Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде. В качестве данных для массива используйте:
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //В результате в консоль должно быть выведено: Ivanov Ivan.
        //Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] paymentsArr = generateRandomArray();
        System.out.println(Arrays.toString(paymentsArr));
        int paymentsSum = 0;
        for (int payment : paymentsArr) {
            paymentsSum += payment;
        }
        System.out.println("Сумма трат за месяц составила " + paymentsSum + " рублей.");

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] paymentsArr = generateRandomArray();
        System.out.println(Arrays.toString(paymentsArr));
        int maxPayment = Integer.MIN_VALUE;
        int minPayment = Integer.MAX_VALUE;
        for (final int payment : paymentsArr) {
            if (payment > maxPayment) {
                maxPayment = payment;
            }
            if (payment < minPayment) {
                minPayment = payment;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxPayment + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minPayment + "  рублей.");

    }


    public static void task3() {
        System.out.println("Задача 3");
        int[] paymentsArr = generateRandomArray();
        System.out.println(Arrays.toString(paymentsArr));
        int amountDays = 30;
        int paymentsSum = 0;
        double averageSum = 0;
        for (int payment : paymentsArr) {
            paymentsSum += payment;
            averageSum = (double) paymentsSum / amountDays;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей.");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

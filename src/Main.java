
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        /*1
        Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Сумма трат за месяц составила … рублей».
        * */
        int days = 30;
        int sum = 0;
        int[] arr = new randomArray().generateRandomArray(days);
        System.out.println(Arrays.toString(arr));
        for (int index : arr) {
            sum += index;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");



        System.out.println("Задание 2");

        /*2
        Следующая задача — найти минимальную и максимальную трату за день.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        * */
        int max = arr.length-1;
        int min = arr[0];
        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей. \nМаксимальная сумма трат за день составила "+ arr[max] + " рублей");


        System.out.println("Задание 3");
        /*2
        А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
        и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        **Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
        * */
        float avgSum = (float) sum/days;
        System.out.println("Средняя сумма трат за месяц составила "+ avgSum+" рублей");


        System.out.println("Задание 4");
        /*
        Отойдем от подсчетов.
        В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться в обратную сторону.
        Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        Данные с именами сотрудников хранятся в виде массива символов (char[]).
        Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
        В качестве данных для массива используйте:
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        В результате в консоль должно быть выведено "Ivanov Ivan".

        **Важно**: не используйте дополнительные массивы для решения этой задачи.
        Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке
        * */
        //char name = 0;
        //char surname = 0;

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
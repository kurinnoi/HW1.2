// kurinnoi
/*
ДЗ 01.2
Создать консольное приложение, которое просит пользователя ввести из консоли 5 чисел
Все числа должны быть записаны в массив целых чисел.

После этого, массив должен быть отсортирован по возрастанию и выведен консоль.
Сначала начальная версия, далее - отсортированная.

Пример:

Enter number 1:
5
Enter number 2:
4
Enter number 3:
3
Enter number 4:
2
Enter number 5:
1

Initial array: 5, 4, 3, 2, 1
Sorted array: 1, 2, 3, 4, 5.
 */
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[5];
        int i = 0;
        Scanner in = new Scanner(System.in);
        for (int element : a) {
            System.out.print("Enter number " + (i + 1) + " ");
            a[i] = in.nextInt();
            System.out.println(a[i]);
            i++;
        }
        System.out.println("Initial array: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
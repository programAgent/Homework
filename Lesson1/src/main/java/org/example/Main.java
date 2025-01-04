package org.example;

public class Main {

    public static void main(String[] args) {
        String string = "I love Java";
        System.out.println("1) Перевернуть строку и вывести на консоль:");
        System.out.println("Оригинальная строка: " + string);
        System.out.print("Перевернутая строка: ");
        Homework.turnString (string);
        System.out.println("\n_________________________________");

        System.out.println("2) Удалить дубликаты из массива и вывести в консоль");
        int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        System.out.println("Изначальный массив: ");
        for(int i:ints){
            System.out.print(i+ " ");
        }
        System.out.println("\nMассив без дубликатов:");
        Homework.getDistinctNumbers(ints);
        System.out.println("\n_________________________________");

        System.out.println("3) Необходимо найти элемент, который меньше максимума, но больше всех остальных.");
        int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        System.out.println("Дан массив: ");
        for (int i:arr){
            System.out.print(i + " ");
        }
        System.out.println("\nЭлемент, который меньше максимума, но больше всех остальных :");
        System.out.println(Homework.findSecondMaxElement(arr));
        System.out.println("_________________________________");

        System.out.println("4) Найти длину последнего слова в строке. В строке только буквы и пробелы:");
        System.out.println(Homework.lengthOfLastWord("Hello world"));
        System.out.println(Homework.lengthOfLastWord("    fly me    to the moon    "));
        System.out.println("_________________________________");

        System.out.println("Определить, что строка является палиндромом, Сложность по памяти O(1)");
        System.out.println(Homework.isPalindrome("abc"));
        System.out.println(Homework.isPalindrome("112233"));
        System.out.println(Homework.isPalindrome("aba"));
        System.out.println(Homework.isPalindrome("112211"));













    }
}
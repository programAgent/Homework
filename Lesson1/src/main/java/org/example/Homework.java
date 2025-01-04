package org.example;

public class Homework {
    // Перевернуть строку и вывести на консоль
    //  String string = "I love Java";
    public static void turnString(String string) {
        for (int i = string.length()-1; i>=0; i--){
            System.out.print(string.charAt(i));
        }

    }

    // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    // Удалить дубликаты из массива и вывести в консоль
    public static void getDistinctNumbers(int[] ints) {
        double uniCount = 0;
        for (int i : ints) {
            int num = 0;
            for (int j : ints) {
                if (i == j) {
                    num++;
                }
            }
            uniCount += 1.0 / num;
        }
        int[] uniNumbers = new int[(int) uniCount];
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            boolean isNum = false;
            for (int j = 0; j < uniNumbers.length; j++) {
                if (ints[i] == uniNumbers[j]) {
                    isNum = true;
                }
                if (isNum) {
                    break;
                }
                if (j == uniNumbers.length - 1) {
                    uniNumbers[index] = ints[i];
                    index ++;
                }
            }
        }
        for (int i:uniNumbers){
            System.out.print(i+" ");
        }
    }
    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {
        int firstMax = arr[0];
        int secondMax = arr[0];
        for (int i : arr){
            if (i> firstMax) {
                firstMax = i;
            } else if (i<firstMax && i> secondMax) {
                secondMax = i;
            }
        }
        return secondMax;
    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {
        System.out.println("строка: " + string);
        String trimString = string.trim();
        int lastSpace = trimString.lastIndexOf(" ");
        if (lastSpace == -1) {
            return trimString.length();
        } else {
            return trimString.length()-lastSpace-1;
        }
    }

    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static boolean isPalindrome(String string) {
        System.out.println("Строка: " + string);
        for (int i = 0; i< string.length()/2; i++) {
            if (string.charAt(i) != string.charAt(string.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}

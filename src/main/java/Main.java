import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Тестирование MyArrays для массива байтов
        byte[] byteArray = {1, 2, 3, 4, 5};
        System.out.println(MyArrays.binarySearch(byteArray, (byte) 3));  // Вывод: 2
        System.out.println(MyArrays.binarySearch(byteArray, (byte) 6));  // Вывод: -6

        // Тестирование MyArrays для массива символов
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(MyArrays.binarySearch(charArray, 'c'));  // Вывод: 2
        System.out.println(MyArrays.binarySearch(charArray, 'f'));  // Вывод: -6

        // Тестирование MyArrays для массива с плавающей запятой (double)
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(MyArrays.binarySearch(doubleArray, 3.3));  // Вывод: 2
        System.out.println(MyArrays.binarySearch(doubleArray, 6.6));  // Вывод: -6

        // Тестирование MyArrays для диапазона double
        System.out.println(MyArrays.binarySearch(doubleArray, 0, doubleArray.length, 4.4));  // Вывод: 3
        System.out.println(MyArrays.binarySearch(doubleArray, 0, doubleArray.length, 6.6));  // Вывод: -6

        // Тестирование MyArrays для массива с плавающей запятой (float)
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        System.out.println(MyArrays.binarySearch(floatArray, 3.3f));  // Вывод: 2
        System.out.println(MyArrays.binarySearch(floatArray, 6.6f));  // Вывод: -6

        // Тестирование MyArrays для диапазона float
        System.out.println(MyArrays.binarySearch(floatArray, 0, floatArray.length, 4.4f));  // Вывод: 3
        System.out.println(MyArrays.binarySearch(floatArray, 0, floatArray.length, 6.6f));  // Вывод: -6

        // Тестирование MyArrays для массива целых чисел (int)
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(MyArrays.binarySearch(intArray, 3));  // Вывод: 2
        System.out.println(MyArrays.binarySearch(intArray, 6));  // Вывод: -6

        // Тестирование MyArrays для диапазона int
        System.out.println(MyArrays.binarySearch(intArray, 0, intArray.length, 4));  // Вывод: 3
        System.out.println(MyArrays.binarySearch(intArray, 0, intArray.length, 6));  // Вывод: -6

        // Тестирование MyArrays для массива длинных целых чисел (long)
        long[] longArray = {1L, 2L, 3L, 4L, 5L};
        System.out.println(MyArrays.binarySearch(longArray, 3L));  // Вывод: 2
        System.out.println(MyArrays.binarySearch(longArray, 6L));  // Вывод: -6

        // Тестирование MyArrays для диапазона long
        System.out.println(MyArrays.binarySearch(longArray, 0, longArray.length, 4L));  // Вывод: 3
        System.out.println(MyArrays.binarySearch(longArray, 0, longArray.length, 6L));  // Вывод: -6

        // Тестирование MyCollections
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(MyCollections.binarySearch(integerList, 3));  // Вывод: 2
        System.out.println(MyCollections.binarySearch(integerList, 6));  // Вывод: -6
    }
}
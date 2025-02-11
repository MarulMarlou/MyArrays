import java.util.Comparator;

public class MyArrays {
    // Бинарный поиск для массива байтов
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        if (fromIndex >= toIndex) {
            return -1; // если индекс начала больше или равен индексу конца
        }
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid; // найдено
            }
        }
        return -(fromIndex + 1); // ключ не найден
    }

    // Бинарный поиск для массива символов
    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        if (fromIndex >= toIndex) {
            return -1; // если индекс начала больше или равен индексу конца
        }
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid; // найдено
            }
        }
        return -(fromIndex + 1); // ключ не найден
    }

    // Бинарный поиск для массива с плавающей запятой (double)
    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        if (fromIndex >= toIndex) {
            return -1; // если индекс начала больше или равен индексу конца
        }
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid; // найдено
            }
        }
        return -(fromIndex + 1); // ключ не найден
    }

    // Бинарный поиск для массива с плавающей запятой (float)
    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        if (fromIndex >= toIndex) {
            return -1; // если индекс начала больше или равен индексу конца
        }
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid; // найдено
            }
        }
        return -(fromIndex + 1); // ключ не найден
    }

    // Бинарный поиск для массива целых чисел (int)
    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        if (fromIndex >= toIndex) {
            return -1; // если индекс начала больше или равен индексу конца
        }
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid; // найдено
            }
        }
        return -(fromIndex + 1); // ключ не найден
    }

    // Бинарный поиск для массива длинных целых чисел (long)
    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        if (fromIndex >= toIndex) {
            return -1; // если индекс начала больше или равен индексу конца
        }
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid; // найдено
            }
        }
        return -(fromIndex + 1); // ключ не найден
    }

    // Бинарный поиск для массива коротких целых чисел (short)
    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        if (fromIndex >= toIndex) {
            return -1; // Если индекс начала больше или равен индексу конца
        }
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid; // Найдено
            }
        }
        return -(fromIndex + 1); // Ключ не найден
    }

    // Бинарный поиск для обобщенных массивов с использованием компаратора
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        if (fromIndex >= toIndex) {
            return -1; // Если индекс начала больше или равен индексу конца
        }
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            int cmp = c.compare(a[mid], key);
            if (cmp < 0) {
                fromIndex = mid + 1;
            } else if (cmp > 0) {
                toIndex = mid;
            } else {
                return mid; // Найдено
            }
        }
        return -(fromIndex + 1); // Ключ не найден
    }
}
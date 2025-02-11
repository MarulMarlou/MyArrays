import java.util.List;
import java.util.Comparator;

public class MyCollections {

    // Бинарный поиск для списка
    public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T key) {
        return binarySearch(list, key, Comparator.naturalOrder());
    }

    // Бинарный поиск для списка с использованием компаратора
    public static <T> int binarySearch(List<T> list, T key, Comparator<? super T> c) {
        int fromIndex = 0;
        int toIndex = list.size();

        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            T midVal = list.get(mid);
            int cmp = c.compare(midVal, key);
            if (cmp < 0) {
                fromIndex = mid + 1; // Ищем в правой половине
            } else if (cmp > 0) {
                toIndex = mid; // Ищем в левой половине
            } else {
                return mid; // Найдено
            }
        }
        return -(fromIndex + 1); // Ключ не найден
    }
}
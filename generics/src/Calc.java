public class Calc<T> {
    public static <T> int findIndex(T[] arr, T element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}

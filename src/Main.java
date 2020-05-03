public class Main {
    public static int sqrt3(int num) {
        int i = 0;
        while (num != 0) {
            i += num - num / 10 * 10;
            num /= 10;
        }
        return i;
    }
}

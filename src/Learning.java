public class Learning {

    public static void main(String[] args) {
        checkSum(3, 5);
        checkNum(10);
        checkNumb(-6);
        printWordNTimes("Homework", 7);
    }

    public static boolean checkSum(int x, int y) {
        int sum = x + y;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    public static void checkNum(int z) {
        if (z >= 0) System.out.println("Это число " + z + " и оно положительное");
        else System.out.println("Это число " + z + " и оно отрицательное");
    }

    public static boolean checkNumb(int n) {
        if (n < 0) return true;
        return false;
    }

    public static void printWordNTimes(String word, int times) {
        for (int j = 0; j < times; j++) {
            System.out.println("Это моя " + word);

        }
    }
}
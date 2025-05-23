// Print all binary strings of size N without consecutive ones.
public class BinaryString {

    public static void printBinString(int n, int ld, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinString(n - 1, 0, str += "0");
        if (ld == 0) {
            printBinString(n - 1, 1, str += "1");
        }
    }

    public static void main(String[] args) {
        printBinString(3, 0, "");
    }
}
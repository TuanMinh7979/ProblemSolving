package Dynamic;

public class fibo {
    //imagin :
    //return is a equal
    //fibo number of vi tri thu 5= fibo number vitri thu4 + fibo number vitri thu3= vitri thu 3 va thu 2+ thu2 va thu1
    //THEO CHIEU TICH LUY LEN
    //THI KET QUA DAT DUOC LAI DUNG DE TINH TOAN CHO VI TRI TIEP THEO
    //CHO NÊN TA TIẾP RETURN("=")
    private static int fibo(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 1 || n == 0) {
            return n;
        } else return fibo(n - 1) + fibo(n - 2);
    }

    private static int fibo1(int n) {

        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println("arr[" + i + "] = " + arr[i - 1] + " + " + arr[i - 2] + "=" + arr[i]);
        }
        return arr[n - 1];
    }

    public static void main(String[] args) {

        System.out.println(fibo(8));

    }
}

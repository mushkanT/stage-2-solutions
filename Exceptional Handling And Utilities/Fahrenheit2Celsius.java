import java.util.*;

class Utility {
    public static int fahrenheitToCelcius(double fahrenheit) {
        double celcius = ((fahrenheit - 32) * 5) / 9;
        celcius = Math.round(celcius);
        int n = (int) celcius;
        return n;
    }

    public static String getLevel(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        if (sum >= 100)
            return "HIGH";
        else if (sum >= 70)
            return "MEDIUM";
        return "LOW";
    }
}

class Source {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int temp = in.nextInt();
            System.out.println(Utility.fahrenheitToCelcius(temp));
        } else if (n == 2) {
            int m = in.nextInt();
            int arr[] = new int[m];
            for (int i = 0; i < m; i++)
                arr[i] = in.nextInt();
            System.out.println(Utility.getLevel(arr));
        }
    }
}
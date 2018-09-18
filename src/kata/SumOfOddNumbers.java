package kata;

public class SumOfOddNumbers {
    /*
             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:

rowSumOddNumbers(1); // 1
rowSumOddNumbers(2); // 3 + 5 = 8
     */

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(2));
    }


    public static int rowSumOddNumbers(int n) {
        int sum = 0;
        int y = 0;
        int z = 1;
        for (int i = 1; i <= n; i++) { // liczy ile jest liczb
            y += i * 1;
        }
        for (int i = 1; i < y; i++) { // oblicza wartosc ostatniej liczby
            z += 2;
        }
        for (int i = 0; i < n; i++) { // oblicza sume danego wiersza
            sum += z;
            z -= 2;
        }
        return sum;
    }
}

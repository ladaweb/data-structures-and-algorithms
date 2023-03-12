import java.util.*;

public class DifferentSummands {
    private static List<Integer> optimalSummands(int n) {
        List<Integer> resSummands = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (2 * i + 1 > n) {
                resSummands.add(n);
                break;
            }
            resSummands.add(i);
            n -= i;
        }
        return resSummands;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}
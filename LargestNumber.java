import java.util.*;

public class LargestNumber {
    private static String largestNumber(String[] a) {
        int part = a.length;
        if (part == 0)
            return "";

        String[] maxSalary = new String[part];
        for (int i = 0; i < part; ++i) {
            maxSalary[i] = String.valueOf(a[i]);
        }

        Arrays.sort(maxSalary, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        StringBuilder res = new StringBuilder();
        for (String salaryPart : maxSalary) {
            res.append(salaryPart);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
        System.out.println(largestNumber(a));
    }
}


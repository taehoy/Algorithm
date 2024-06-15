import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < T; i++) {
            String str = scanner.nextLine();
            System.out.println(checkPalindromeType(str));
        }
    }

    private static int checkPalindromeType(String str) {
        Map<String, Boolean> cache = new HashMap<>();
        if (isPalindrome(str, cache)) {
            return 0;
        }
        if (isPseudoPalindrome(str, cache)) {
            return 1;
        }
        return 2;
    }

    private static boolean isPalindrome(String str, Map<String, Boolean> cache) {
        if (cache.containsKey(str)) {
            return cache.get(str);
        }

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                cache.put(str, false);
                return false;
            }
            left++;
            right--;
        }
        cache.put(str, true);
        return true;
    }

    private static boolean isPseudoPalindrome(String str, Map<String, Boolean> cache) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return isPalindrome(str.substring(left + 1, right + 1), cache) ||
                       isPalindrome(str.substring(left, right), cache);
            }
            left++;
            right--;
        }
        return false; // This line is actually unreachable, but added for completeness
    }
}
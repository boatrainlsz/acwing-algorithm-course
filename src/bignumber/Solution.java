package bignumber;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.multiply("2", "3"));
    }

    public String multiply(String num1, String num2) {
        String ans = "";
        for (int i = num2.length() - 1; i >= 0; i--) {
            StringBuilder mul = new StringBuilder(multiply0(num1, num2.charAt(i)));
            for (int j = 0; j < num2.length() - i - 1; j++) {
                mul.append("0");
            }
            ans = add(ans.toCharArray(), mul.toString().toCharArray());
        }
        StringBuilder result = new StringBuilder();
        if (ans.length() > 1) {
            int i = 0;
            while (ans.charAt(i) == '0') {
                if (i == ans.length() - 1) {
                    break;
                }
                i++;
            }
            result.append(ans.substring(i));
        }else {
            return ans;
        }
        return result.toString();
    }

    private String multiply0(String num1, char b) {
        int num2 = char2Int(b);
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int i = num1.length();
        while (i > 0) {
            i--;
            int mul = char2Int(num1.charAt(i)) * num2;
            sb.insert(0, (carry + mul) % 10);
            carry = (carry + mul) / 10;
        }
        if (carry != 0) sb.insert(0, carry);
        return sb.toString();
    }

    public String add(char[] a, char[] b) {
        if (a.length == 0) return new String(b);
        if (b.length == 0) return new String(a);
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        int i = a.length, j = b.length;
        while (i > 0 || j > 0) {
            i--;
            j--;
            int sum = (i < 0 ? 0 : char2Int(a[i]))
                    + (j < 0 ? 0 : char2Int(b[j])) + carry;
            ans.insert(0, sum % 10);
            carry = sum / 10;
        }
        if (carry != 0) ans.insert(0, carry);
        return ans.toString();
    }

    private static int char2Int(char c) {
        return c - '0';
    }
}
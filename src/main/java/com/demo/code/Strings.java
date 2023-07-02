package com.demo.code;

import com.demo.util.Utils;
import org.apache.commons.lang3.StringUtils;

/**
 * @author chris
 * @create 2023/6/19
 */
public class Strings {
    public static void mergeAlternately() {
//* 示例 1：
//     * 输入：word1 = "abc", word2 = "pqr"
//     * 输出："apbqcr"
//     * 示例 2：
//     * 输入：word1 = "ab", word2 = "pqrs"
//     * 输出："apbqrs"
//     * 示例 3：
//     * 输入：word1 = "abcd", word2 = "pq"
//     * 输出："apbqcd"
        String word1 = "abc";
        String word2 = "pqr";
        String merged = mergeAlternately(word1, word2);
        System.out.println("merged string: " + merged);
    }

    public static void gcdOfStrings() {
        String str1 = "ABCABC";
        String str2 = "ABC";
        String common = gcdOfStrings(str1, str2);

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("common: " + common);
    }

    public static void reverseVowels() {
//        String input = "hello";
        String input = "leetcode";
        System.out.println("input: " + input);
        String output = reverseVowels(input);
        System.out.println("output: " + output);
    }

    public static void reverseWords() {
        String input = "the sky is blue";
//        String input = "  hello world  ";
        System.out.println("input: " + input);
        String output = reverseWords(input);
        System.out.println("output: " + output);
    }


    /**
     * 1768. 交替合并字符串
     * 给你两个字符串 word1 和 word2 。请你从 word1 开始，通过交替添加字母来合并字符串。
     * 如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。
     * 返回 合并后的字符串 。
     * <p>
     * 示例 1：
     * 输入：word1 = "abc", word2 = "pqr"
     * 输出："apbqcr"
     * 解释：字符串合并情况如下所示：
     * word1：  a   b   c
     * word2：    p   q   r
     * 合并后：  a p b q c r
     * 示例 2：
     * 输入：word1 = "ab", word2 = "pqrs"
     * 输出："apbqrs"
     * 解释：注意，word2 比 word1 长，"rs" 需要追加到合并后字符串的末尾。
     * word1：  a   b
     * word2：    p   q   r   s
     * 合并后：  a p b q   r   s
     * 示例 3：
     * 输入：word1 = "abcd", word2 = "pq"
     * 输出："apbqcd"
     * 解释：注意，word1 比 word2 长，"cd" 需要追加到合并后字符串的末尾。
     * word1：  a   b   c   d
     * word2：    p   q
     * 合并后：  a p b q c   d
     */
    private static String mergeAlternately(String word1, String word2) {
        if (StringUtils.isEmpty(word1)) {
            return word2;
        }
        if (StringUtils.isEmpty(word2)) {
            return word1;
        }

        int length1 = word1.length();
        int length2 = word2.length();
        int index1 = 0;
        int index2 = 0;
        StringBuilder sb = new StringBuilder();
        while (index1 < length1 || index2 < length2) {
            if (index1 < length1) {
                sb.append(word1.charAt(index1));
                index1++;
            }
            if (index2 < length2) {
                sb.append(word2.charAt(index2));
                index2++;
            }
        }
        return sb.toString();
    }

    /**
     * 1071. 字符串的最大公因子
     * 对于字符串 s 和 t，只有在 s = t + ... + t（t 自身连接 1 次或多次）时，
     * 我们才认定 “t 能除尽 s”。
     * 给定两个字符串 str1 和 str2 。
     * 返回 最长字符串 x，要求满足 x 能除尽 str1 且 x 能除尽 str2 。
     * 示例 1：
     * 输入：str1 = "ABCABC", str2 = "ABC"
     * 输出："ABC"
     * 示例 2：
     * 输入：str1 = "ABABAB", str2 = "ABAB"
     * 输出："AB"
     * 示例 3：
     * 输入：str1 = "LEET", str2 = "CODE"
     * 输出：""
     */
    private static String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private static int gcd(int a, int b) {
        int remainder = a % b;
        while (remainder != 0) {
            a = b;
            b = remainder;
            remainder = a % b;
        }
        return b;
    }

    /**
     * 345. 反转字符串中的元音字母
     * 给一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
     * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现不止一次。
     * 示例 1：
     * 输入：s = "hello"
     * 输出："holle"
     * 示例 2：
     * 输入：s = "leetcode"
     * 输出："leotcede"
     */
    private static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        // char[] 转 Character[]
        Character[] characters = new String(chars).chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);
//        Utils.printIntArray(characters);

        int length = characters.length;
        int left = 0;
        int right = length - 1;
        while (left < right) {
            while (left < length && !Utils.isVowel(characters[left])) {
                left++;
            }
            while (right < length && !Utils.isVowel(characters[right])) {
                right--;
            }
            if (left < right) {
                Utils.swap(characters, left, right);
                left++;
                right--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : characters) {
            sb.append(c.toString());
        }
        return sb.toString();
    }


    /**
     * 151. 反转字符串中的单词
     * 给一个字符串 s ，请你反转字符串中 单词 的顺序。
     * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
     * 返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
     * 注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
     * 示例 1：
     * 输入：s = "the sky is blue"
     * 输出："blue is sky the"
     * 示例 2：
     * 输入：s = "  hello world  "
     * 输出："world hello"
     * 解释：反转后的字符串中不能存在前导空格和尾随空格。
     * 示例 3：
     * 输入：s = "a good   example"
     * 输出："example good a"
     * 解释：如果两个单词间有多余的空格，反转后的字符串需要将单词间的空格减少到仅有一个。
     */
    private static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int length = words.length;
        int left = 0;
        int right = length - 1;
        while (left < right) {
            Utils.swap(words, left, right);
            left++;
            right--;
        }
        return StringUtils.join(words, " ");
    }
}
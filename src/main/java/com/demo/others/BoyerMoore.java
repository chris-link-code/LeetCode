package com.demo.others;

/**
 * Boyer-Moore算法
 * https://favtutor.com/blogs/boyer-moore-algorithm
 */
public class BoyerMoore {
    private static int NO_OF_CHARS = 256;

    private static int max(int a, int b) {
        //returns max of two numbers
        return (a > b) ? a : b;
    }

    private static void badCharHeuristic(char[] str, int size, int badChar[]) {

        // Initialize all occurrences as -1
        for (int i = 0; i < NO_OF_CHARS; i++) {
            badChar[i] = -1;
        }

        // Fill the actual value of last occurrence of a character
        for (int i = 0; i < size; i++) {
            badChar[str[i]] = i;
        }
    }

    private static void search(char txt[], char pat[]) {
        int m = pat.length;
        int n = txt.length;

        int badChar[] = new int[NO_OF_CHARS];

        badCharHeuristic(pat, m, badChar);

        int s = 0;
        while (s <= (n - m)) {
            int j = m - 1;

		    /* Keep reducing index j of pattern while
			characters of pattern and text are
			matching at this shift s */
            while (j >= 0 && pat[j] == txt[s + j]) {
                j--;
            }

		    /* If the pattern is present at current
			shift, then index j will become -1 after
			the above loop */
            if (j < 0) {
                System.out.println("Patterns occur at shift = " + s);
                s += (s + m < n) ? m - badChar[txt[s + m]] : 1;
            } else {
                s += max(1, j - badChar[txt[s + j]]);
            }
        }
    }

    public static void run() {
        char txt[] = "ABAAABCD".toCharArray();
        char pat[] = "ABC".toCharArray();
        search(txt, pat);
    }
}
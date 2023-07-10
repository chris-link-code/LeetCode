package com.demo;

import com.demo.code.Arrays;
import lombok.extern.slf4j.Slf4j;

/**
 * @author chris
 * @create 2023/5/28
 */
@Slf4j
public class Application {
    public static void main(String[] args) {
        log.info("java.version: " + System.getProperty("java.version"));
        //int processors = Runtime.getRuntime().availableProcessors();

//        Sort.run();
//        BinarySearch.run();
//        DFS.run();
//        FindOddFromArray.run();

//        ListNodeReverse.run();
//        Nodes.getIntersectionNode();
//        Nodes.mergeListNode();
//        Nodes.addTwoNumbers();

//        Arrays.mergeTwoArrays();
//        Arrays.removeElement();
//        Arrays.removeDuplicate();
//        Arrays.removeDuplicates();
//        BoyerMoore.run();
//        Arrays.majorityElement();
//        Arrays.kidsWithCandies();
//        Arrays.canPlaceFlowers();
//        Arrays.productExceptSelf();
//        Arrays.increasingTriplet();
        Arrays.compress();

//        Strings.mergeAlternately();
//        Strings.gcdOfStrings();
//        Strings.reverseVowels();
//        Strings.reverseWords();
    }
}

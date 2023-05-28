package com.demo;

import com.demo.others.ListNodeMerge;
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

//        BinarySearch.run();
//        DFS.run();
//        FindOddFromArray.run();
//        ListNodeIntersection.run();
//        ListNodeReverse.run();
//        Sort.run();

        ListNodeMerge.run();
    }
}

package com.pflb.learning.utils;


/**
 * Tools class for testing
 *
 * @author Viktoriya Ibraimova
 * @version dated Nov 28, 2017
 */
public class Tools {

    public static void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
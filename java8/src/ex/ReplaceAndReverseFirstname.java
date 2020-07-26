/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

/**
 *
 * @author Vishnu EK
 */
public class ReplaceAndReverseFirstname {

    public static void main(String[] args) {
        String input = "This is JEE assignment";
        String replaceString = replaceAndReverse(input, "JEE", "JAVA");
        System.out.println(replaceString);
        System.out.println(reverse(replaceString));
    }

    private static String replaceAndReverse(String input, String stringToReplace, String replaceWith) {
        char[] inputArray = input.toCharArray();
        char[] stringToReplaceArray = stringToReplace.toCharArray();
        char[] replaceWithArray = replaceWith.toCharArray();
        int totalSize = getTotalSize(inputArray, stringToReplaceArray, replaceWithArray);
        char[] newArray = new char[totalSize];
        return replacing(newArray, inputArray, stringToReplaceArray, replaceWithArray);
    }

    private static String reverse(String intro) {
        char[] combine = new char[intro.length() + 2];
        char[] split = intro.toCharArray();
        int c = 0;
        for (int i = split.length - 1, j = split.length - 1; i >= 0; i--) {
            if (split[i] == ' ' || i == 0) {
                int start = i == 0 ? i : i + 1;
                for (; start <= j; start++) {
                    combine[c++] = split[start];
                }
                if (j == split.length - 1) {
                    combine[c++] = ' ';
                }
                j = i;
            }
        }
        return new String(combine);
    }

    private static int getTotalSize(char[] inputArray, char[] stringToReplaceArray, char[] replaceWithArray) {
        int count = 0;
        int noOfString = 0;
        for (int i = 0, j = 0; i <= inputArray.length - 1; i++) {
            if (inputArray[i] == stringToReplaceArray[j]) {
                count++;
                j++;
            } else {
                count = 0;
            }
            if (count == stringToReplaceArray.length) {
                noOfString++;
                j = 0;
                count = 0;
            }
        }
        System.out.println("noOfString " + noOfString);
        return inputArray.length - (noOfString * stringToReplaceArray.length) + noOfString * replaceWithArray.length;
    }

    private static String replacing(char[] outputArray, char[] inputArray, char[] stringToReplaceArray, char[] replaceWithArray) {
        int count = 0;
        int newArrayIndex = 0;
        for (int i = 0, j = 0; i <= inputArray.length - 1; i++) {
            if (inputArray[i] == stringToReplaceArray[j]) {
                count++;
                j++;
            } else {
                outputArray[newArrayIndex++] = inputArray[i];
            }
            if (count == stringToReplaceArray.length) {

                for (int a = 0; a < replaceWithArray.length; a++) {
                    outputArray[newArrayIndex++] = replaceWithArray[a];
                }
                count = 0;
                j = 0;
            }
        }
        return new String(outputArray);
    }
}

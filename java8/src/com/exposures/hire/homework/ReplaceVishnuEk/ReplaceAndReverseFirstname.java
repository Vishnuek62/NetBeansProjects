package com.exposures.hire.homework.ReplaceVishnuEk;

/**
 *
 * @author Vishnu EK
 */
public class ReplaceAndReverseFirstname {
    
    public static final int ONE = 1;
    public static final int ZERO = 0;
    public static final String EMPTY_STRING = "";
    public static final char SPACE = ' ';
    
    public ReplaceAndReverseFirstname()
    {
        //default consructor
    }
    
    public static void main(String[] args) {
        String input = "This is JEE assignment";
        String replaceString = replaceAndReverse(input, "JEE", "JAVA");
        System.out.println(replaceString);
    }

    /**
     * this method is used to replace and reverse the string like "This is JEE
     * assignment" --> "assignment JAVA is This" //JAVA replacing JEE  
     *
     * @param input
     * @param stringToReplace
     * @param replaceWith
     * @return
     */
    private static String replaceAndReverse(String input, String stringToReplace, String replaceWith) {
        char[] inputArray = input.toCharArray();
        char[] stringToReplaceArray = stringToReplace.toCharArray();
        char[] replaceWithArray = replaceWith.toCharArray();
        int outputArraySize = getTotalSize(inputArray, stringToReplaceArray, replaceWithArray);
        char[] newArray = new char[outputArraySize];
        return reverse(replace(newArray, inputArray, stringToReplaceArray, replaceWithArray));
    }

    /**
     * This method is used to get output array length
     *
     * @param inputArray
     * @param stringToReplaceArray
     * @param replaceWithArray
     * @return
     */
    private static int getTotalSize(char[] inputArray, char[] stringToReplaceArray, char[] replaceWithArray) {
        int count = ZERO;
        int noOfString = ZERO;
        for (int i = ZERO, j = ZERO; i <= inputArray.length - ONE; i++) {
            if (inputArray[i] == stringToReplaceArray[j]) {
                count++;
                j++;
            } else {
                count = ZERO;
            }
            if (count == stringToReplaceArray.length) {
                noOfString++;
                j = ZERO;
                count = ZERO;
            }
        }
        return inputArray.length + noOfString * (replaceWithArray.length - stringToReplaceArray.length);
    }

    /**
     * This method is used to replacing String with other string
     *
     * @param outputArray
     * @param inputArray
     * @param stringToReplaceArray
     * @param replaceWithArray
     * @return
     */
    private static String replace(char[] outputArray, char[] inputArray, char[] stringToReplaceArray, char[] replaceWithArray) {
        int count = ZERO;
        int newArrayIndex = ZERO;
        for (int i = ZERO, j = ZERO; i <= inputArray.length - ONE; i++) {
            if (inputArray[i] == stringToReplaceArray[j]) {
                count++;
                j++;
            } else {
                outputArray[newArrayIndex++] = inputArray[i];
            }
            if (count == stringToReplaceArray.length) {
                for (int k = ZERO; k < replaceWithArray.length; k++) {
                    outputArray[newArrayIndex++] = replaceWithArray[k];
                }
                count = ZERO;
                j = ZERO;
            }
        }
        return new String(outputArray);
    }

    /**
     * This method is used to reverse the String like "This is java" to "java is
     * This"
     *
     * @param input as String
     * @return String
     */
    private static String reverse(String input) {
        if (null != input && !input.isEmpty()) {
            char[] inputArray = input.toCharArray();
            int inputArrayLength = inputArray.length;
            char[] outputArray = new char[inputArray.length + ONE];
            int outputArrayIndex = ZERO;
            for (int i = inputArrayLength - ONE, j = inputArrayLength - ONE; i >= ZERO; i--) {
                if (inputArray[i] == SPACE || i == ZERO) {
                    int start = i == ZERO ? i : i + ONE;
                    for (; start <= j; start++) {
                        outputArray[outputArrayIndex++] = inputArray[start];
                    }
                    if (j == inputArrayLength - ONE) {
                        outputArray[outputArrayIndex++] = SPACE;
                    }
                    j = i;
                }
            }
            return new String(outputArray);
        }
        return EMPTY_STRING;
    }
}

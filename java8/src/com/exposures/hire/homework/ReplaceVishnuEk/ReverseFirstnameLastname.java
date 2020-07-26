package com.exposures.hire.homework.ReplaceVishnuEk;

/**
 *
 * @author Vishnu EK
 */
public class ReverseFirstnameLastname {

    public static final int ONE = 1;
    public static final int ZERO = 0;
    public static final String EMPTY_STRING = "";
    public static final char SPACE = ' ';

    public ReverseFirstnameLastname()
    {
        //default constructor
    }
    
    public static void main(String[] args) {
        System.out.println(reverse("This is JEE assignment"));
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

package org.example.sevenHomework;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "g", "15", "16"}
        };

        try {
            int result = doCalc(array);
            System.out.println("Result: " + result);
        } catch (ArraySizeException e) {
            System.out.println("Invalid array size: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("Invalid data in array: " + e.getMessage());
        }
    }

    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int expectedRows = 4;
        int expectedCols = 4;

        if (array.length != expectedRows) {
            throw new ArraySizeException(String
                    .format("Expected %dx%d. Rows are %d", expectedRows, expectedCols, array.length));
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != expectedCols) {
                throw new ArraySizeException(String
                        .format("Expected %dx%d. Colum are %d in %d rows", expectedRows, expectedCols, array[i].length, i + 1));
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("At row " + (i + 1) + ", column " + (j + 1), e);
                }
            }
        }

        return sum;
    }
}




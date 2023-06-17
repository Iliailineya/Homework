package org.example.sevenHomework;

class ArrayDataException extends Exception {
    public ArrayDataException(String message, NumberFormatException e) {
        super(message + " " + e.getMessage());
    }
}

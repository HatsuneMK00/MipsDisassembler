package edu.ca.mips.data;

public class Data {
    private String binaryCode;
    private int value;

    public Data(String binaryCode) {
        this.binaryCode = binaryCode;
        this.value = Integer.parseUnsignedInt(binaryCode, 2);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(getValue());
    }
}

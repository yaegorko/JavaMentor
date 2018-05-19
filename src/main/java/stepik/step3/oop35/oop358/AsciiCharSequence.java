package stepik.step3.oop35.oop358;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {

    byte[] bytesArray;

    public AsciiCharSequence(byte[] bytesArray) {
        this.bytesArray = bytesArray;
    }


    @Override
    public int length() {
        return bytesArray.length;
    }

    @Override
    public char charAt(int index) {
        return (char) bytesArray[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(bytesArray, start, end));
    }

    @Override
    public String toString() {
       return new String(bytesArray);
    }
}

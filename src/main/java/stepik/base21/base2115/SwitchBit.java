package stepik.base21.base2115;

public class SwitchBit {

    /**
     * Flips one bit of the given <code>value</code>.
     * @param value     any number
     * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {

//        int result = 0;
//
//        int[] arrayOfBits = new int[Integer.valueOf(value).BYTES];
//        int position = 0;
//
//        do {
//            arrayOfBits[position++] = value % 2;
//            value /= 2;
//        } while (value >= 1);
//
//        if (bitIndex > 0 && arrayOfBits[--bitIndex] == 0) {
//            arrayOfBits[bitIndex] = 1;
//        } else if (bitIndex > 0 && arrayOfBits[--bitIndex] == 1) {
//            arrayOfBits[bitIndex] = 0;
//        }
//
//        int degreeOfTwo = 0;
//
//        for (int arrayOfNumber : arrayOfBits) {
//            if (arrayOfNumber == 1) {
//                result = (int) (Math.pow(2, arrayOfNumber * degreeOfTwo) + result);
//            }
//            degreeOfTwo++;
//        }
        return value ^ (1 << (bitIndex - 1));
    }
}

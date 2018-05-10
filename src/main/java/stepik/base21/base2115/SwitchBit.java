package stepik.base21.base2115;

public class SwitchBit {

    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value     any number
     * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {

        String string = "";
        int result = 0;

        do {
            string = string + value % 2 + ",";
            value = value / 2;
        } while (value >= 1);

        String[] splitStringArray = string.split(",");

        int[] arrayOfNumbers = new int[splitStringArray.length];
        for (int i = 0; i < splitStringArray.length; i++) {
            arrayOfNumbers[i] = Integer.parseInt(splitStringArray[i]);
        }

        if (arrayOfNumbers[--bitIndex] == 0) {
            arrayOfNumbers[bitIndex] = 1;
        } else {
            arrayOfNumbers[bitIndex] = 0;
        }

        int degreeOfTwo = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] == 1) {
                result = (int) (Math.pow(2, arrayOfNumbers[i] * degreeOfTwo) + result);
            }
            degreeOfTwo++;
        }

        return result;
        // put your implementation here
    }
}

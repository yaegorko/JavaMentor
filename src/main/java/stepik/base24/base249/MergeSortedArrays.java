package stepik.base24.base249;

public class MergeSortedArrays {

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] mergedArray = new int[a1.length + a2.length];
        int i = 0, j = 0;

        while (i + j  < mergedArray.length) {
            if (i < a1.length && j < a2.length) {
                mergedArray[i + j] = a1[i] < a2[j] ? a1[i++] : a2[j++];
            } else if (i == a1.length) {
                System.arraycopy(a2, j, mergedArray, i + j, a2.length - j);
                break;
            } else if (j == a2.length) {
                System.arraycopy(a1, i, mergedArray, i + j, a1.length - i);
                break;
            }
        }

        return mergedArray;
    }
}

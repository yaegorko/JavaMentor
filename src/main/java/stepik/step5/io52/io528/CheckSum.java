package stepik.step5.io52.io528;

import java.io.IOException;
import java.io.InputStream;

public class CheckSum {

    public static int checkSumOfStream(InputStream inputStream) throws IOException {

        int checkSum = 0;
        int isNotOver = inputStream.read();
        while (isNotOver > -1) {
            checkSum = Integer.rotateLeft(checkSum, 1) ^ isNotOver;
            isNotOver = inputStream.read();
        }
        return checkSum;
    }
}

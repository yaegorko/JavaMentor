package stepik.step5.io53.io5312;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class ByteToString {
//    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
//
//        int bufferSize = 1024;
//        char[] buffer = new char[bufferSize];
//        StringBuilder out = new StringBuilder();
//        try (Reader in = new InputStreamReader(inputStream, charset)) {
//            while (true) {
//                int rsz = in.read(buffer, 0, buffer.length);
//                if (rsz < 0)
//                    break;
//                out.append(buffer, 0, rsz);
//            }
//
//            return out.toString();
//        }
//    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        StringBuilder out = new StringBuilder();
        try (Reader in = new InputStreamReader(inputStream, charset)) {
            int rsz;
            while ((rsz = in.read()) > -1) {
                out.append((char) rsz);
            }
            return out.toString();
        }
    }
}

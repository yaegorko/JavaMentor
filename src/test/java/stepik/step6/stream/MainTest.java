package stepik.step6.stream;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    Main main = new Main();
    String string = "Мама, мыла-мыла-мыла раму!";
    String string2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
            "Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, " +
            "faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. " +
            "Vestibulum eget metus imperdiet sapien laoreet faucibus. " +
            "Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, " +
            "consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.";

    @Test
    public void testStringToStream() {
        //String string = "Мама мыла-мыла-мыла раму!";
        main.parseString(string);
    }

    @Test
    public void testStream() {
        main.parseString(string2);
    }


}
package stepik.step6.stream;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainTest {

    Main main = new Main();
    String string = "Мама, мыла-мыла-мыла раму!";
    String string2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
            + "Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, "
            + "faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. "
            + "Vestibulum eget metus imperdiet sapien laoreet faucibus. "
            + "Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, "
            + "consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.";

    String string3 = " Мама мыла раму 33 раза! ";

    String string4 = "    -=   =- - -  =";

    @Test
    public void testStream() {
        String input =
                "Напишите программу, читающую из System.in текст в кодировке UTF-8, подсчитывающую в нем частоту появления слов, и в конце выводящую 10 наиболее часто встречающихся слов.\n"
                        + "\n"
                        + "Словом будем считать любую непрерывную последовательность символов, состоящую только из букв и цифр. Например, в строке \"Мама мыла раму 33 раза!\" ровно пять слов: \"Мама\", \"мыла\", \"раму\", \"33\" и \"раза\".\n"
                        + "\n"
                        + "Подсчет слов должен выполняться без учета регистра, т.е. \"МАМА\", \"мама\" и \"Мама\" — это одно и то же слово. Выводите слова в нижнем регистре.\n"
                        + "\n"
                        + "Если в тексте меньше 10 уникальных слов, то выводите сколько есть.\n"
                        + "\n"
                        + "Если в тексте некоторые слова имеют одинаковую частоту, т.е. их нельзя однозначно упорядочить только по частоте, то дополнительно упорядочите слова с одинаковой частотой в лексикографическом порядке.\n"
                        + "\n"
                        + "Задача имеет красивое решение через стримы без циклов и условных операторов. Попробуйте придумать его.";
        String expected =
                "в\r\n"
                        + "и\r\n"
                        + "мама\r\n"
                        + "слов\r\n"
                        + "слова\r\n"
                        + "то\r\n"
                        + "10\r\n"
                        + "33\r\n"
                        + "без\r\n"
                        + "выводите";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        main.parseString(main.readFromSystemIn());
       // assertEquals(expected, baos.toString().trim());
    }
}

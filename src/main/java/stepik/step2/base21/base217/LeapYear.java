package stepik.step2.base21.base217;

public class LeapYear {

    public static int leapYearCount(int year) {

        int yearCount = 0;

        for (int i = 1; i <= year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                yearCount++;
            }
        }
        return yearCount;
    }
}

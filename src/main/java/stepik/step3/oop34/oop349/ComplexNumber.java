package stepik.step3.oop34.oop349;
/**
 * Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры ComplexNumber по содержимому полей re и im, а hashCode() был бы согласованным с реализацией equals().
 *
 * Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет
 *
 * Пример
 *
 * ComplexNumber a = new ComplexNumber(1, 1);
 * ComplexNumber b = new ComplexNumber(1, 1);
 * // a.equals(b) must return true
 * // a.hashCode() must be equal to b.hashCode()
 *
 * Подсказка 1. Поищите в классе java.lang.Double статический метод, который поможет в решении задачи.
 * Подсказка 2. Если задача никак не решается, можно позвать на помощь среду разработки, которая умеет сама генерировать equals() и hashCode().
 * Если вы воспользовались помощью IDE, то разберитесь, что было сгенерировано и почему оно выглядит именно так.
 * Когда вас на собеседовании попросят на бумажке реализовать equals() и hashCode() для какого-нибудь простого класса, то среда разработки помочь не сможет.
 */

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        //getClass() используем вместо instanceof
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComplexNumber complexNumber = (ComplexNumber) o;

        return this.im == complexNumber.im && this.re == complexNumber.re;
    }

    //нагуглил и забукал мнение как считать hashcode для примитивных типов.
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Double.hashCode(im);
        result = 31 * result + Double.hashCode(re);
        return result;
    }
}

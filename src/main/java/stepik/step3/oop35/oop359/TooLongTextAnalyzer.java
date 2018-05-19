package stepik.step3.oop35.oop359;

class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        Label label = Label.OK;
        if (text.length() > maxLength) {
            label = Label.TOO_LONG;
        }
        return label;
    }
}

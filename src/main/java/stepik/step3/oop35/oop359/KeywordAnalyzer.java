package stepik.step3.oop35.oop359;

abstract class KeywordAnalyzer implements TextAnalyzer {

    @Override
    public Label processText(String text) {
        Label label = Label.OK;
        for (String string: getKeywords()) {
            if (text.contains(string)) {
                label = getLabel();
            }
        }
        return label;
    }

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

}

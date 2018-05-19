package stepik.step3.oop35.oop359;

class NegativeTextAnalyzer extends KeywordAnalyzer  {


    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}

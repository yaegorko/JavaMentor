package stepik.step3.oop35.oop359;

class SpamAnalyzer extends KeywordAnalyzer  {

    private String[] keywords;

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }


    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}

package stepik.step3.oop35.oop359;

class Checker {

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {

        Label result = Label.OK;

        for (TextAnalyzer analyzer: analyzers) {
            if (!analyzer.processText(text).equals(Label.OK)) {
                result = analyzer.processText(text);
                break;
            }
        }
        return result;
    }

}

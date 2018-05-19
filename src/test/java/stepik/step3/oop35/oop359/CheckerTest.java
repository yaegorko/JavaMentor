package stepik.step3.oop35.oop359;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckerTest {

    Checker checker = new Checker();
    SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"spam"});
    NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
    TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(30);
    TextAnalyzer[] analyzers = new TextAnalyzer[] {spamAnalyzer, negativeTextAnalyzer, tooLongTextAnalyzer};

    @Test
    public void whenHaveSpamInTextThenGetLabelSpam() {
        assertThat(checker.checkLabels(analyzers, "Hi! i am spam!"), is(Label.SPAM));
    }

    @Test
    public void whenHaveNegativeInTextThanGetLabelNEGATIVE_TEXT() {
        assertThat(checker.checkLabels(analyzers, "Hi! i am not happy today :(!"), is(Label.NEGATIVE_TEXT));
    }

    @Test
    public void whenHaveToLongTextThanGetLabelTOO_LONG() {
        assertThat(checker.checkLabels(analyzers, "bla bla bla bla bla bla bla bla bla bla bla bla "), is(Label.TOO_LONG));
    }

    @Test
    public void whenHavePerfectTextThanGetLabelOK() {
        assertThat(checker.checkLabels(analyzers, "Hi! I'm happy today!"), is(Label.OK));
    }

}
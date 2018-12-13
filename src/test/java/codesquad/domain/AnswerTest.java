package codesquad.domain;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import support.test.BaseTest;

import static org.junit.Assert.*;

public class AnswerTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(AnswerTest.class);

    public static User owner = new User(1, "sehun", "test", "sehun", "test@test.com");
    public static User other = new User(2, "sechun", "test", "sechun", "test@test.com");

    public static Question question = new Question("title", "contents");
    public static Question updateQuestion = new Question("title2", "contents2");

    @Test
    public void toQuestion() {
        Answer newAnswer = new Answer(owner, "contents");
        question.addAnswer(newAnswer);
        logger.debug("newAnswer question : {}", newAnswer.getQuestion());
        softly.assertThat(newAnswer.getQuestion()).isEqualTo(question);
    }
}
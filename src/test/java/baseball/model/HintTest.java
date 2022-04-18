package baseball.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HintTest {

    @DisplayName("힌트 생성")
    @Test
    public void createHint() {
        // when
        Hint hint = new Hint(1, 2);

        // then
        Assertions.assertEquals(hint.getStrike(), 1);
        Assertions.assertEquals(hint.getBall(), 2);
    }
    @DisplayName("3개의 숫자를 모두 맞히면 승리")
    @Test
    public void winTest() {
        // when
        Hint hint = new Hint(3, 0);

        // then
        assertThat(hint.isWin()).isTrue();
    }

}
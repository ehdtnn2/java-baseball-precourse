package baseball.model;

import baseball.model.ball.AutoBallGenerator;
import baseball.model.ball.BallNumber;
import baseball.model.ball.InputBallGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @DisplayName("play 테스트")
    @Test
    public void play() {
        //given
        Player defender = new Player(new AutoBallGenerator());
        Player offender = new Player(new AutoBallGenerator());

        //when
        Game game = new Game(offender, defender);
        Hint hint = game.play();

        //then
        assertThat(hint).isNotNull();
    }

}
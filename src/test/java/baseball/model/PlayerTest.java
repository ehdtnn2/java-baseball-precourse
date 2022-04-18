package baseball.model;

import baseball.model.Player;
import baseball.model.ball.AutoBallGenerator;
import baseball.model.ball.BallNumber;
import baseball.model.Hint;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerTest {

    @DisplayName("플레이어는 볼 넘버를 생성한다.")
    @Test
    public void createBallNumber() {
        //given
        Player player = new Player(new AutoBallGenerator());

        //given
        BallNumber ballNumber = player.makeBall();

        //then
        assertThat(ballNumber).isNotNull();
    }

    @DisplayName("수비자는 볼 넘버를 판단하여 힌트를 알려준다.")
    @Test
    public void judgeBallNumber() {
        //given
        Player defender = new Player(new AutoBallGenerator());
        Player offender = new Player(new AutoBallGenerator());
        BallNumber BallOfDefender = defender.makeBall();
        BallNumber BallOfOffender = offender.makeBall();

        //when
        Hint hint = defender.judge(BallOfOffender);

        //then
        assertThat(hint).isNotNull();
    }

}
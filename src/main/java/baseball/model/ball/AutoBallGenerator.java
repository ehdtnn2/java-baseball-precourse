package baseball.model.ball;

import camp.nextstep.edu.missionutils.Randoms;

import static baseball.model.ball.BallNumber.*;

public class AutoBallGenerator implements BallGenerator {

    @Override
    public BallNumber makeBallNumber() {
        return new BallNumber(Randoms.pickUniqueNumbersInRange(BALL_MIN, BALL_MAX, BALL_SIZE));
    }

}

package baseball.model;

import baseball.model.ball.BallGenerator;
import baseball.model.ball.BallNumber;

import java.util.List;

public class Player {

    private BallNumber myBall;

    private BallGenerator ballGenerator;

    public Player(BallGenerator ballGenerator) {
        this.ballGenerator = ballGenerator;
    }

    public BallNumber makeBall() {
        myBall = ballGenerator.makeBallNumber();
        return myBall;
    }

    public Hint judge(BallNumber offenderBall) {
        int strike = 0;
        int ball = 0;

        List<Integer> offenderNumbers = offenderBall.getNumbers();

        for (int i = 0; i < offenderNumbers.size(); i++) {
            int number = offenderNumbers.get(i);
            ball = isBall(i, number) ? ball + 1 : ball;
            strike = isStrike(i, number) ? strike + 1 : strike;
        }

        return new Hint(strike, ball);
    }

    private boolean isBall(int index, int value) {
        List<Integer> myNumbers = myBall.getNumbers();
        return (myNumbers.contains(value) && myNumbers.get(index) != value);
    }

    private boolean isStrike(int index, int value) {
        List<Integer> myNumbers = myBall.getNumbers();
        return myNumbers.get(index) == value;
    }
}

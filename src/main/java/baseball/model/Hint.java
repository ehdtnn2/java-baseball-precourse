package baseball.model;

import baseball.model.ball.BallNumber;

public class Hint {
    private int strike;
    private int ball;
    private boolean win;

    public Hint(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;

        validateRangeOfNumber();
        validateMaxCountOfSum();
    }

    private void validateRangeOfNumber() throws IllegalArgumentException {
        if ((strike < 0 || strike > BallNumber.BALL_SIZE)
            || (ball < 0 || ball > BallNumber.BALL_SIZE)) {
            throw new IllegalArgumentException();
        }
    }

    private void validateMaxCountOfSum() throws IllegalArgumentException {
        int sum = ball + strike;
        if (sum > BallNumber.BALL_SIZE) {
            throw new IllegalArgumentException();
        }
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean isWin() {
        return (strike == 3);
    }
}

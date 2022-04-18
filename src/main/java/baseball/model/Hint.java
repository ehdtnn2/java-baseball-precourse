package baseball.model;

public class Hint {
    private int strike;
    private int ball;
    private boolean win;

    public Hint(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
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
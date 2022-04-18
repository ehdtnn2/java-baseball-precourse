package baseball.model;

public class Game {

    private Player offender;
    private Player defender;
    private boolean win;

    public Game(Player offender, Player defender) {
        this.offender = offender;
        this.defender = defender;
        defender.makeBall();
    }

    public Hint play() {
        Hint hint = defender.judge(offender.makeBall());
        if (hint.isWin()) {
            win = true;
        }
        return hint;
    }

    public Boolean isWin() {
        return win;
    }
}

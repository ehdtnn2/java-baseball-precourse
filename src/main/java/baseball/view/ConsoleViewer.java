package baseball.view;

import baseball.model.Hint;

public class ConsoleViewer {

    public static final String NOTHING = "낫싱";
    public static final String BALL = "볼";
    public static final String STRIKE = "스트라이크";
    public static final String WHITE_SPACE = " ";

    public static final String START_INFO = "게임 준비 완료. 게임을 시작합니다.";
    public static final String INPUT_INFO = "숫자를 입력해주세요 : ";
    public static final String RESTART_INFO = " 게임 종료. 게임을 재시작하려면 y, 종료하려면 아무키나 입력해주세요 : ";


    public void printGameStartMsg() {
        System.out.println(START_INFO);
    }

    public void printHint(Hint hint) {
        System.out.println(makeMessage(hint.getBall(), hint.getStrike()));
    }

    private String makeMessage(int ball, int strike) {
        String result = "";

        if (ball == 0 && strike == 0) return NOTHING;
        if (ball > 0) result += ball + BALL + WHITE_SPACE;
        if (strike > 0) result += strike + STRIKE;

        return result;
    }

    public void printRestartMsg() {
        System.out.println(RESTART_INFO);
    }

    public void printUserInputMsg() {
        System.out.println(INPUT_INFO);
    }
}

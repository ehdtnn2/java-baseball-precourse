package baseball;

import baseball.controller.BaseballController;
import camp.nextstep.edu.missionutils.Randoms;

public class Application {
    public static void main(String[] args) {
        BaseballController baseballController = new BaseballController();
        baseballController.gameStart();
    }
}

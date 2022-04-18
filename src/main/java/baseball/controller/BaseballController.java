package baseball.controller;

import baseball.model.ball.AutoBallGenerator;
import baseball.model.ball.InputBallGenerator;
import baseball.model.Game;
import baseball.model.Player;
import baseball.view.ConsoleViewer;
import camp.nextstep.edu.missionutils.Console;

public class BaseballController {

    private Game game;
    private ConsoleViewer consoleViewer;

    public BaseballController() {
        consoleViewer = new ConsoleViewer();
    }

    public void gameStart() {
        gameInit();
        consoleViewer.printGameStartMsg();

        while ( !game.isWin() ) {
            consoleViewer.printUserInputMsg();
            consoleViewer.printHint(game.play());
        }

        consoleViewer.printRestartMsg();
        askRestart();
    }

    public void gameInit() {
        Player user = new Player(new InputBallGenerator());
        Player computer = new Player(new AutoBallGenerator());
        game = new Game(user, computer);
    }

    public void askRestart() {
        String input = Console.readLine();
        if ("y".equals(input.toLowerCase())) {
            gameStart();
        };
    }

}

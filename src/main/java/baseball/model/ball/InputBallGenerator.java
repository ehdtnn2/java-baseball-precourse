package baseball.model.ball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputBallGenerator implements BallGenerator {

    @Override
    public BallNumber makeBallNumber() {
        List<Integer> numbers = new ArrayList<>();

        String input = Console.readLine();
        for (int i = 0; i < input.length(); i++) {
            numbers.add(Character.getNumericValue(input.charAt(i)));
        }

        return new BallNumber(numbers);
    }
}

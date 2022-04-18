package baseball.model.ball;

import java.util.*;

public class BallNumber {
    static final int BALL_MIN = 1;
    static final int BALL_MAX = 9;
    static final int BALL_SIZE = 3;

    static final String INVALID_RANGE_NUMBER = "1~9가 아닌 숫자가 입력";
    static final String INVALID_DUPLICATION_NUMBER = "중복된 숫자 존재";
    static final String INVALID_COUNT_NUMBER = "사용자 입력이 3자리가 아님";

    private List<Integer> numbers;

    public BallNumber(List<Integer> ballNumbers) {
        this.numbers = ballNumbers;

        validateRangeOfNumber();
        validateDuplicationOfNumber();
        validateCountOfNumber();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    private void validateRangeOfNumber() throws IllegalArgumentException {
        for (Integer number : numbers) {
            if (number < BALL_MIN || number > BALL_MAX) {
                throw new IllegalArgumentException(INVALID_RANGE_NUMBER);
            }
        }
    }

    private void validateDuplicationOfNumber() throws IllegalArgumentException {
        Set<Integer> set = new HashSet<>(numbers);
        if (set.size() != numbers.size()) {
            throw new IllegalArgumentException(INVALID_DUPLICATION_NUMBER);
        }
    }

    private void validateCountOfNumber() throws IllegalArgumentException {
        if (numbers.size() != BALL_SIZE) {
            throw new IllegalArgumentException(INVALID_COUNT_NUMBER);
        }
    }
}

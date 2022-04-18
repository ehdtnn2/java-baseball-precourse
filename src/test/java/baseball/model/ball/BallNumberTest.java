package baseball.model.ball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class BallNumberTest {

    @DisplayName("[정상] 볼 넘버는 1부터 9까지 서로 다른 수로 이루어진 3자리의 수로 구성된다.")
    @ValueSource(strings = {"123", "456", "789"})
    @ParameterizedTest
    public void test(String input) {
        // given
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            numbers.add(Character.getNumericValue(input.charAt(i)));
        }
        //when
        BallNumber ballNumber = new BallNumber(numbers);

        //then
        assertThat(ballNumber).isNotNull();
    }

    @DisplayName("[예외] 사용자 입력이 1~9가 아닌 숫자인 경우")
    @Test
    public void validateRangeOfNumber() {
        //given
        List<Integer> numbers = Arrays.asList(1,0,2);

        //when
        assertThatThrownBy(() -> new BallNumber(numbers))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("[예외] 사용자 입력이 중복된 경우")
    @Test
    public void validateDuplicationOfNumber() {
        //given
        List<Integer> numbers = Arrays.asList(1,1,2);

        //when
        assertThatThrownBy(() -> new BallNumber(numbers))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("[예외] 사용자 입력이 3자리가 아닌 경우 (미입력 포함)")
    @Test
    public void validateCountOfNumber() {
        //given
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        List<Integer> numbersZero = Arrays.asList();

        //when
        assertThatThrownBy(() -> new BallNumber(numbers))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new BallNumber(numbersZero))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
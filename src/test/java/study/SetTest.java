package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @DisplayName("요구사항 1 : Set의 size() 메소드를 활용해 Set의 크기를 확인")
    @Test
    public void size() {
        //when
        int size = numbers.size();

        //then
        assertEquals(size, 3);
    }

    @DisplayName("요구사항 2 : Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인")
    @ValueSource(ints = {1, 2, 3})
    @ParameterizedTest
    public void contains(int input) {
        //when
        boolean contains = numbers.contains(input);

        //then
        assertThat(contains).isTrue();
    }

    @DisplayName("요구사항 3 : 입력 값에 따라 결과 값이 다른 경우에 대한 테스트")
    @CsvSource(value = {"1,true", "2,true", "3,true", "4,false", "5,false"})
    @ParameterizedTest
    public void contains(int input, boolean expected) {
        //when
        boolean contains = numbers.contains(input);

        //then
        assertEquals(contains, expected);
    }
}
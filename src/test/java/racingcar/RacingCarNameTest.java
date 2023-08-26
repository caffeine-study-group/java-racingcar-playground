package racingcar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class RacingCarNameTest {

    @Test
    void 자동차_이름_5자_초과_불가_테스트() {

        assertThatThrownBy(() -> {
            new CarName("abcdee");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 자동차의 이름이 올바르지 않습니다.");
    }

    @ParameterizedTest
    @NullAndEmptySource
    void 자동차_이름_0글자_불가_테스트(String input) {
        assertThatThrownBy(() -> {
            new CarName(input);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 자동차의 이름이 올바르지 않습니다.");
    }

}

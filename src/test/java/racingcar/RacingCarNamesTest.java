package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class RacingCarNamesTest {

    @Test
    void 자동차_이름_자르기_실패_테스트(){
        String inputCarName = "aaa,b,c, ,";

        assertThatThrownBy(() -> {
            CarNames.from(inputCarName);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 자동차의 이름이 올바르지 않습니다.");
    }
}

package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LapTest {

    @Test
    void 바퀴는_양수만_입력_되어야_한다() {
        int lap = -1;

        assertThatThrownBy(() -> new Lap(lap))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("1보다 커야합니다.");
    }

    @Test
    void 바퀴수_테스트() {
        Lap lap = new Lap(3);
        lap.tryLap();
        lap.tryLap();
        assertFalse(lap.isGoal());
        lap.tryLap();
        assertTrue(lap.isGoal());
    }
}

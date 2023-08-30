package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.Location;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LocationTest {

    @Test
    void 생성된_위치가_맞는지_테스트() {
        int expected = 2;

        Location location = new Location(expected);
        assertEquals(expected, location.getLocation());
    }

    @Test
    void 레이싱카_위치_비교_참_테스트() {
        Location location = new Location(2);
        Location expectedLocation = new Location(2);
        assertEquals(location, expectedLocation);
    }

    @Test
    void 레이싱카_위치_비교_거짓_테스트() {
        Location location = new Location(2);
        Location expectedLocation = new Location(3);
        assertNotEquals(location, expectedLocation);
    }

    @Test
    void 레이싱카_위치_이동_테스트() {
        Location location = new Location(2);
        location.forward();
        assertEquals(new Location(3), location);
    }
}

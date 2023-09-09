package racingcar.domain;

import java.util.Collections;

public class Lap {

    private final String DASH = "-";
//    private final char DASH = '-';

    private int currentLap;
    private final int finalLap;
    private final String maxProgressBar;

    public Lap(int finalLap) {
        if (finalLap < 1) {
            throw new IllegalArgumentException("1보다 커야합니다.");
        }

        this.finalLap = finalLap;
        this.currentLap = 0;

//        maxProgressBar = new String(new char[finalLap]).replace('\0', DASH);
        maxProgressBar = String.join("", Collections.nCopies(finalLap, DASH));
//        maxProgressBar = DASH.repeat(finalLap);
    }

    public boolean isOnTheRacing() {
        return !this.isGoal();
    }

    public boolean isGoal() {
        return this.currentLap == this.finalLap;
    }

    public void tryLap() {
        if (this.isOnTheRacing()) {
            this.currentLap++;
        }
    }

    public String getProgressBar(Location location) {
        return maxProgressBar.substring(0, location.getLocation());
    }
}

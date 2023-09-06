package racingcar.domain;

public class Lap {

    private int currentLap;
    private final int finalLap;

    public Lap(int finalLap) {
        if (finalLap < 1) {
            throw new IllegalArgumentException("1보다 커야합니다.");
        }
        this.finalLap = finalLap;
        this.currentLap = 0;
    }

    public boolean isGoal() {
        return this.currentLap == this.finalLap;
    }

    public void tryLap() {
        if (!this.isGoal()) {
            this.currentLap++;
        }
    }
}

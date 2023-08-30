package racingcar.domain;

public class Location {
    private int location;

    public Location(int location) {
        this.location = location;
    }

    public void forward() {
        this.location = this.location + 1;
    }

    public int getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location1 = (Location) o;
        return location == location1.location;
    }
}

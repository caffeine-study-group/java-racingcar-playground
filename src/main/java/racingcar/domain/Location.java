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

    public Location getMaxLocation(Location maxLocation) {
        if (maxLocation.moreThan(location)) {
            return this;
        }

        return maxLocation;
    }

    private boolean moreThan(int location) {
        return this.location > location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location1 = (Location) o;
        return location == location1.location;
    }

    @Override
    public String toString() {
        return "Location{" +
                "location=" + location +
                '}';
    }
}

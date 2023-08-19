package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarNames {
    private static final String CAR_NAME_SEPARATOR = ",";
    List<CarName> list;

    private CarNames(List<CarName> list) {
        this.list = list;
    }

    public static CarNames from(String input) {
        List<CarName> splitCarName = new ArrayList<>();
        for (String s : input.split(CAR_NAME_SEPARATOR)) {
            splitCarName.add(new CarName(s));
        }
        return new CarNames(splitCarName);
    }

    public List<CarName> getList() {
        return list;
    }
}

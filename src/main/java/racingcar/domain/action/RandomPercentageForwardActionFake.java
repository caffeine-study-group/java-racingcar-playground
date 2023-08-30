package racingcar.domain.action;

public class RandomPercentageForwardActionFake extends RandomPercentageForwardAction {

    private final int[] randomNumberArr = new int[]{3, 4};
    private int randomNumberIndex = 0;

    @Override
    public int getRandom() {
        return randomNumberArr[randomNumberIndex++];
    }
}

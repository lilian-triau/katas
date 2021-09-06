package triau.lilian.training.katas;

public enum Die {
    ONE(100, 1000), TWO(0, 200), THREE(0, 300), FOUR(0, 400), FIVE(50, 500), SIX(0, 0);

    private Integer baseValue;
    private Integer tripleValue;

    Die(Integer baseValue, Integer tripleValue) {
        this.baseValue = baseValue;
        this.tripleValue = tripleValue;
    }

    public Integer getBaseValue() {
        return baseValue;
    }

    public Integer getTripleValue() {
        return tripleValue;
    }
}

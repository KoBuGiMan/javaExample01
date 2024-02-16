package classdino;

public enum EatFood {
    HERBIVORE("초식"),
    CARNIVORE("육식"),
    OMNIVORE("잡식");

    private String eat;

    private EatFood(String eat) {
        this.eat = eat;
    }

    public String getFood() {
        return eat;
    }
}

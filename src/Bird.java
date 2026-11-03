public class Bird extends Animal {
    private String featherColor;

    public Bird() {
    }

    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public void layEggs() {
        System.out.println("Bird lays eggs");
    }

    public void eat(String food) {
        System.out.println("Bird eats " + food);
    }

    public void getVoice() {
        System.out.println("Tweet tweet");
    }

    public String toString() {
        return super.toString() + " " + featherColor;
    }
}

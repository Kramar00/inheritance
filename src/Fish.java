public class Fish extends Animal {
    private String scaleColor;

    public Fish() {
    }

    public Fish(String name, int age, int weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public void swim() {
        System.out.println("Fish swims");
    }

    public void eat(String food) {
        System.out.println("Fish eats " + food);
    }

    public void getVoice() {
        System.out.println("Fish makes bubbles");
    }

    public String toString() {
        return super.toString() + " " + scaleColor;
    }
}
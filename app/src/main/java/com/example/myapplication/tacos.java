

public class Tacos{
    private String name;
    private boolean  tomato_Sauce;
    private boolean  Samurai_Sauce;
    private boolean  Spicy_Sauce;
    private boolean  Barbecue_Sauce;
    private boolean  Olive;
    private boolean  Anchovy;
    private boolean  Chicken;
    private boolean  Cheese;
    private boolean  Cheese1;
    private boolean  Cheese2;
    private boolean  Cheese3;
    private boolean  Cheese4;
    private boolean  vegetabes;
    private boolean  white_sauce;
    private boolean  Meat;
    private boolean  Fries;
    private double price;

    public Tacos(String name, boolean tomato_Sauce, boolean samurai_Sauce, boolean spicy_Sauce, boolean barbecue_Sauce, boolean olive, boolean anchovy, boolean chicken, boolean cheese, boolean cheese1, boolean cheese2, boolean cheese3, boolean cheese4, boolean vegetabes, boolean white_sauce, boolean meat, boolean fries, double price) {
        this.name = name;
        this.tomato_Sauce = tomato_Sauce;
        Samurai_Sauce = samurai_Sauce;
        Spicy_Sauce = spicy_Sauce;
        Barbecue_Sauce = barbecue_Sauce;
        Olive = olive;
        Anchovy = anchovy;
        Chicken = chicken;
        Cheese = cheese;
        Cheese1 = cheese1;
        Cheese2 = cheese2;
        Cheese3 = cheese3;
        Cheese4 = cheese4;
        this.vegetabes = vegetabes;
        this.white_sauce = white_sauce;
        Meat = meat;
        Fries = fries;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTomato_Sauce() {
        return tomato_Sauce;
    }

    public void setTomato_Sauce(boolean tomato_Sauce) {
        this.tomato_Sauce = tomato_Sauce;
    }

    public boolean isSamurai_Sauce() {
        return Samurai_Sauce;
    }

    public void setSamurai_Sauce(boolean samurai_Sauce) {
        Samurai_Sauce = samurai_Sauce;
    }

    public boolean isSpicy_Sauce() {
        return Spicy_Sauce;
    }

    public void setSpicy_Sauce(boolean spicy_Sauce) {
        Spicy_Sauce = spicy_Sauce;
    }

    public boolean isBarbecue_Sauce() {
        return Barbecue_Sauce;
    }

    public void setBarbecue_Sauce(boolean barbecue_Sauce) {
        Barbecue_Sauce = barbecue_Sauce;
    }

    public boolean isOlive() {
        return Olive;
    }

    public void setOlive(boolean olive) {
        Olive = olive;
    }

    public boolean isAnchovy() {
        return Anchovy;
    }

    public void setAnchovy(boolean anchovy) {
        Anchovy = anchovy;
    }

    public boolean isChicken() {
        return Chicken;
    }

    public void setChicken(boolean chicken) {
        Chicken = chicken;
    }

    public boolean isCheese() {
        return Cheese;
    }

    public void setCheese(boolean cheese) {
        Cheese = cheese;
    }

    public boolean isCheese1() {
        return Cheese1;
    }

    public void setCheese1(boolean cheese1) {
        Cheese1 = cheese1;
    }

    public boolean isCheese2() {
        return Cheese2;
    }

    public void setCheese2(boolean cheese2) {
        Cheese2 = cheese2;
    }

    public boolean isCheese3() {
        return Cheese3;
    }

    public void setCheese3(boolean cheese3) {
        Cheese3 = cheese3;
    }

    public boolean isCheese4() {
        return Cheese4;
    }

    public void setCheese4(boolean cheese4) {
        Cheese4 = cheese4;
    }

    public boolean isVegetabes() {
        return vegetabes;
    }

    public void setVegetabes(boolean vegetabes) {
        this.vegetabes = vegetabes;
    }

    public boolean isWhite_sauce() {
        return white_sauce;
    }

    public void setWhite_sauce(boolean white_sauce) {
        this.white_sauce = white_sauce;
    }

    public boolean isMeat() {
        return Meat;
    }

    public void setMeat(boolean meat) {
        Meat = meat;
    }

    public boolean isFries() {
        return Fries;
    }

    public void setFries(boolean fries) {
        Fries = fries;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
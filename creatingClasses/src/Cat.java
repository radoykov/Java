class Cat {
    private final int lives = 9;
    private int leftLives;
    private int years;
    private String color;
    private static int count = 0;

    public Cat() {
        setLeftLives(lives);
        setYears(1);
        setColor("orange");
        count++;
    }

    public Cat(int leftLives, int years, String color) {
        setLeftLives(leftLives);
        setYears(years);
        setColor(color);
        count++;
    }

    public void displayInfo() {
        System.out.printf("LeftLives: %d %n years: %d %n color: %s %n lostLives : %d %n countOfCats : %d %n", getLeftLives(), getYears(), getColor(), getLostLives(), getCount());
    }

    public void setLeftLives(int leftLives) {
        this.leftLives = leftLives;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLeftLives() {
        return this.leftLives;
    }

    public int getYears() {
        return this.years;
    }

    public String getColor() {
        return this.color;
    }

    public int getCount() {
        return count;
    }

    public int getLostLives() {
        return this.lives - this.leftLives;
    }

}
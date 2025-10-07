void main() {
    //class Cat
    System.out.println("\nCat");
    Cat cat = new Cat(5, 3, "dark");
    cat.displayInfo();
    Cat cat2 = new Cat();

    cat2.displayInfo();
    System.out.printf("Years : %d", cat2.getYears());

    //class Rating
    System.out.println("\nRating");
    double[] arr = {5.50, 3.60};
    Rating rating = new Rating(arr);
    rating.addRating(4.75);
    rating.calculate();
    rating.displayInfo();
    cat.setYears(10);
}

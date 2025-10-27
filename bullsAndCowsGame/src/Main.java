void main() {
    //implementing not brutal force algorithms (although they are useful with not so high numbers like 8-9 digital)
    executeAlgoA();
    executeAlgoB();
    executeAlgoC();
}

void executeAlgoA() {
    long startTime = System.currentTimeMillis(); // Start timer
    var a = new PlayerA();
    var b = new PlayerB(); //creates the secret number

    int number = a.initialGuess();
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    double avg = 0.0;
    for (int i = 0; i < 1000; i++) {
        int counter = 0;
        while (true) {
            counter++;
            var cowsAndBulls = b.getCawsAndBulls(number);
//            System.out.println(number + " C: " + cowsAndBulls.getCows() + " B: " + cowsAndBulls.getBulls());
            if (cowsAndBulls.getBulls() == 4) {
//                System.out.printf("End game in %d moves!\n", counter);
                if (counter < min) min = counter;
                if (counter > max) max = counter;
                avg += counter;
                break;
            }
            number = a.guessA(cowsAndBulls);
        }
        //recreates the secret number
        a.resetGame();
        b.regenerateTheNumber();
    }
    avg /= 1000;

    long endTime = System.currentTimeMillis(); // End timer
    System.out.println("Random guess : " + " Min -> " + min + " Max -> " + max + " Avg -> " + avg + " Duration_sec -> " + ((endTime - startTime)) / 1_000.0);
}

void executeAlgoB() {
    long startTime = System.currentTimeMillis(); // Start timer

    var a = new PlayerA();
    var b = new PlayerB(); //creates the secret number

    int number = a.initialGuess();
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    double avg = 0.0;
    for (int i = 0; i < 1000; i++) {
        int counter = 0;
        while (true) {
            counter++;
            var cowsAndBulls = b.getCawsAndBulls(number);
//            System.out.println(number + " C: " + cowsAndBulls.getCows() + " B: " + cowsAndBulls.getBulls());
            if (cowsAndBulls.getBulls() == 4) {
//                System.out.printf("End game in %d moves!\n", counter);
                if (counter < min) min = counter;
                if (counter > max) max = counter;
                avg += counter;
                break;
            }
            number = a.guessB(cowsAndBulls);
        }
        //recreates the secret number
        a.resetGame();
        b.regenerateTheNumber();
    }
    avg /= 1000;
    long endTime = System.currentTimeMillis(); // End timer
    System.out.println("Heuristic guess : " + "Min -> " + min + " Max -> " + max + " Avg -> " + avg + " Duration_sec -> " + ((endTime - startTime)) / 1_000.0);
}


void executeAlgoC() {
    long startTime = System.currentTimeMillis(); // Start timer

    var a = new PlayerA();
    var b = new PlayerB(); //creates the secret number

    int number = a.initialGuess();
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    double avg = 0.0;
    for (int i = 0; i < 1000; i++) {
        int counter = 0;
        while (true) {
            counter++;
            var cowsAndBulls = b.getCawsAndBulls(number);
//            System.out.println(number + " C: " + cowsAndBulls.getCows() + " B: " + cowsAndBulls.getBulls());
            if (cowsAndBulls.getBulls() == 4) {
//                System.out.printf("End game in %d moves!\n", counter);
                if (counter < min) min = counter;
                if (counter > max) max = counter;
                avg += counter;
                break;
            }
            number = a.guessC(cowsAndBulls);
        }
        //recreates the secret number
        a.resetGame();
        b.regenerateTheNumber();
    }
    avg /= 1000;
    long endTime = System.currentTimeMillis(); // End timer
    System.out.println("Knuth-style minimax guess : " + "Min -> " + min + " Max -> " + max + " Avg -> " + avg + " Duration_sec -> " + ((endTime - startTime) / 1_000.0));
}
import java.util.regex.Pattern;

void main() {
    String test = "a@b@c";

    System.out.println("1) Symbol before @: " + Pattern.matches("^[^@]+@", test));
    System.out.println("2) Contains @: " + Pattern.matches(".*@.*", test));
    System.out.println("3) Symbol after @: " + Pattern.compile("@[^@]+").matcher(test).find());
    System.out.println("4) Three @ followed by .: " + Pattern.compile("@@@(?=\\.)").matcher(test).find());
    System.out.println("5) At least two @: " + Pattern.matches("^(?:[^@]*@){2,}.*$", test));

}
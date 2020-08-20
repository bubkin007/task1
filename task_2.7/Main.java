public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
            String v = Integer.toString(number);
        char[] characters = v.toCharArray();
        return Character.getNumericValue(characters[0])+Character.getNumericValue(characters[1])+Character.getNumericValue(characters[2]);
    }
}

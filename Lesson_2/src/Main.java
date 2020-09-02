public class Main {
    public static void main(String[] args) {
        String[][] numbers = {
                {"231", "12", "-8", "92"},
                {"231", "12", "-8", "92"},
                {"231", "12", "-8", "92"},
                {"231", "12", "-8", "92"}
        };
        new Numbers().checkSize(numbers);
        new Numbers().calculateNumbers(numbers);
    }
}

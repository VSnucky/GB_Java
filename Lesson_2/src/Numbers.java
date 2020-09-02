public class Numbers{
    public int checkSize(String[][] numbers){
        if (numbers.length != 4){
            throw new MyArraySizeException("Array should have length 4");
        }
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i].length != 4)
                throw new MyArraySizeException("Array should have length 4");
        }
        return 0;
    }
    public void calculateNumbers(String[][] numbers){
        int a = 0;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                try{
                    a += Integer.parseInt(numbers[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException("Array value is not parsable " + numbers[i][j], e);
                }
            }
        }
        System.out.println(a);
    }
}

public class ArraysMultidimensionais02 {

    public static void main(String[] args) {

        int[] array = {1, 2, 4};

        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{6, 5, 4, 3, 2, 1};


        for (int[] arrayBase : arrayInt) {
            System.out.println("\n--------");
            for (int num : arrayBase) {

                System.out.println(num + "");
            }
        }
    }
}

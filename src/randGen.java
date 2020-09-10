public class randGen {
    public static void main(String[] arg){
        randGen();
    }

    public static int[] arr(int[] arrSum) {
        boolean sorted = false;
        int temp;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < arrSum.length - 1; i++){
                if (arrSum[i] > arrSum[i+1]){
                    temp = arrSum[i];
                    arrSum[i] = arrSum[i+1];
                    arrSum[i +1] = temp;
                    sorted = false;
                }
            }
        }
        return arrSum;
    }

    public static void randGen()
    {
        int n = 10;
        int[] arrSum = new int[n];
        System.out.println("Рандомные числа в массиве:");
        for (int i = 0; i < n; i++)
        {
            arrSum[i] = (int)(Math.random() * 100);
            System.out.println(arrSum[i]);
        }
        arrSum = arr(arrSum);

        System.out.println("Массив после сортировки:");
        for (int i = 0; i < n; i++)
        {
            System.out.println(arrSum[i]);
        }
    }
}

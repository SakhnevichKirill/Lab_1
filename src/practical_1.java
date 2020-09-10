public class practical_1 {
    public static void main(String[] arg) {
        int n = 10;
        int[] arrSum = new int[n];
        for (int i = 0; i < n; i++)
        {
            arrSum[i] = (int)(Math.random() * 100);
            System.out.print(arrSum[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arrSum[i];
        }
        System.out.println(sum);

        sum = 0;
        int i = 0;
        while (i < n) {
            sum += arrSum[i];
            i++;
        }
        System.out.println(sum);

        sum = 0;
        i = 0;
        do {
            sum += arrSum[i];
            i++;
        } while (i < n);
        System.out.println(sum);
    }
}


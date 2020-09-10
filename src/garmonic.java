public class garmonic {
    public static void main(String[] arg){
        int n = 10;
        double sum = 0;
        for (int i = 1; i <= n; i++)
        {
            double k = (double) 1/i;
            System.out.println(k);
            sum += k;
        }
        System.out.println("Сумма всех чисел гармонического ряда: " + sum);
    }
}

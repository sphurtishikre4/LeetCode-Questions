public class SpyArray {
    public static void main(String[] args) {
        int[] a = {1124,123,1412,22,15};
        int[] b = new int[a.length];
        int index = 0;

        for (int num : a) {
            int temp = num;
            int sum = 0;
            int product = 1;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                product *= digit;
                temp /= 10;
            }

            if (sum == product)
                b[index++] = num;
        }

        System.out.println("Spy Numbers:");
        for(int i=0;i<index;i++)
            System.out.println(b[i]);
    }
}

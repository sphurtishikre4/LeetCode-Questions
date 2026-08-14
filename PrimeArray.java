public class PrimeArray {
    public static void main(String[] args) {
        int[] a={2,4,5,8,11,15,17};
        int[] b=new int[a.length];
        int index=0;

        for(int num:a){
            if(num<2)
                continue;

            boolean prime=true;

            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    prime=false;
                    break;
                }
            }

            if(prime)
                b[index++]=num;
        }

        System.out.println("Prime Numbers:");
        for(int i=0;i<index;i++)
            System.out.println(b[i]);
    }
}
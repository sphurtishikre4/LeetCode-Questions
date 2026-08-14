public class UglyArray {
    public static void main(String[] args) {

        int[] a={6,8,14,15,25};
        int[] b=new int[a.length];
        int index=0;

        for(int num:a){

            int temp=num;

            while(temp%2==0)
                temp/=2;

            while(temp%3==0)
                temp/=3;

            while(temp%5==0)
                temp/=5;

            if(temp==1)
                b[index++]=num;
        }

        System.out.println("Ugly Numbers:");
        for(int i=0;i<index;i++)
            System.out.println(b[i]);
    }
}
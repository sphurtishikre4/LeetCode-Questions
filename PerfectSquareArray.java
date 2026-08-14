public class PerfectSquareArray {
    public static void main(String[] args) {

        int[] a={4,8,9,10,16,20,25};
        int[] b=new int[a.length];
        int index=0;

        for(int num:a){
            int root=(int)Math.sqrt(num);

            if(root*root==num)
                b[index++]=num;
        }

        System.out.println("Perfect Square Numbers:");
        for(int i=0;i<index;i++)
            System.out.println(b[i]);
    }
}
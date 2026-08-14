public class SunnyArray {
    public static void main(String[] args) {

        int[] a={3,8,15,24,35};
        int[] b=new int[a.length];
        int index=0;

        for(int num:a){
            int root=(int)Math.sqrt(num+1);

            if(root*root==num+1)
                b[index++]=num;
        }

        System.out.println("Sunny Numbers:");
        for(int i=0;i<index;i++)
            System.out.println(b[i]);
    }
}

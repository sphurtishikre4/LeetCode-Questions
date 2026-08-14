public class TechArray {
    public static void main(String[] args) {

        int[] a={2025,3025,9801,1000};
        int[] b=new int[a.length];
        int index=0;

        for(int num:a){

            String s=String.valueOf(num);

            if(s.length()%2!=0)
                continue;

            int mid=s.length()/2;

            int first=Integer.parseInt(s.substring(0,mid));
            int second=Integer.parseInt(s.substring(mid));

            int sum=first+second;

            if(sum*sum==num)
                b[index++]=num;
        }

        System.out.println("Tech Numbers:");
        for(int i=0;i<index;i++)
            System.out.println(b[i]);
    }
}
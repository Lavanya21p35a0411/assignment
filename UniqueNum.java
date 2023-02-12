import java.util.ArrayList;
public class UniqueNum {
    public static void main(String[] args) {
        int[] ar=new int[]{1,4,2,3,1,3,2,5,6,7};
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<ar.length;i++)
        {
            if(al.contains(ar[i])){
                continue;
            }
            else{
                al.add(ar[i]);
            }
        }
        System.out.println(al);
    }
}

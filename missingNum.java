import java.util.ArrayList;
public class missingNum{
    public static void main(String[] args) {
        int[] ar=new int[]{1,2,4,6,7,8,10};
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]+1 !=ar[i+1]){
                al.add(ar[i]+1);
            }
            else{
                continue;
            }
        }
        System.out.println(al);
    }
}
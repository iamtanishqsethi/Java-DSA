import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/relative-sort-array/
public class RelativeSort {//
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==arr2[i]){
                    list.add(arr1[j]);
                    //marking the selected no
                    arr1[j]=-1;
                }
            }
        }
        Arrays.sort(arr1);
        //add remaining no to list
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=-1) list.add(arr1[i]);
        }
        //converting array list to integer
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

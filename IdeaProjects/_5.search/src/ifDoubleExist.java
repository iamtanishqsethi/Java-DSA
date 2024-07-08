import java.util.Arrays;

public class ifDoubleExist {
    //bad time complexity O(n^2) , require sets and hash maps for better time complexity
    public boolean checkIfExist(int[] arr) {
        boolean ans=false;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]*2==arr[j]){
                    ans=true;
                }
            }
        }
        return ans;
    }
}

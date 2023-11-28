import java.io.FilterOutputStream;
import java.util.Arrays;
//to flip and invert (0 to 1 and 1 to 0) the 2D array;
public class FlipImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] arr =new int[image.length ][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j =image[i].length-1;j>=0;j--){
                arr[i][image.length-1-j]=image[i][j];
            }
        }for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=0;
                }
            }
        }return arr;
    }
}

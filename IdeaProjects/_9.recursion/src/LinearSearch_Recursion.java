public class LinearSearch_Recursion {
    //linear search using recursion
    public static void main(String[] args) {
        int[] arr ={3,2,1,18,9};
        int target = 18;
        System.out.println(search(arr,target,0));
    }
    static int search(int[] arr,int target,int index){
        if(index>=arr.length){
            //base condition : when index goes out of bound
            return -1;
        }
        else{
            if(arr[index]==target){
                return index;
            }else{
                return search(arr,target,index+1);
            }
        }
    }
}

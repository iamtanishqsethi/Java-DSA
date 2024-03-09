import java.util.ArrayList;

public class MultiElementLS {
    //to search for an element (occurs multiple times in the array)
    // when ever we are encountering the element instead of returning it
    // we can add it to an array list
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,4,5,9};
        int target = 4;
        System.out.println(searchAll3(arr,target,0));
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void searchAll(int[] arr,int target,int index){
        if(index>=arr.length){
            //base condition : when index goes out of bound
            return ;
        }
        else{
            if(arr[index]==target){
                list.add(index);
            }
            searchAll(arr,target,index+1);

        }
    }
    static ArrayList<Integer> searchAll2(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index>=arr.length){
            //base condition : when index goes out of bound
            return list;
        }
        else{
            if(arr[index]==target){
                list.add(index);
            }
             return searchAll2(arr,target,index+1,list);

        }
    }
    //what if we cannot pass the arraylist in the argument ?
    static ArrayList<Integer> searchAll3(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index>=arr.length){
            //base condition : when index goes out of bound
            return list;
        }//this will contain answer for that function call only
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = searchAll3(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}

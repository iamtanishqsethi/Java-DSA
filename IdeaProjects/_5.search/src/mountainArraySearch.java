public class mountainArraySearch {
    //https://leetcode.com/problems/find-in-mountain-array/
    public static int findInMountainArray(int target,int[] mountianArr){
        int peak = peakinmountainarray(mountianArr);
        int firsttry=orderAgnosticBS(mountianArr,0,peak,target);
        if (firsttry!=-1){
            return firsttry;
        }else{
            return orderAgnosticBS(mountianArr,peak+1, mountianArr.length-1,target);
        }
    }
    public static int orderAgnosticBS(int[] arr ,int start,int end,int target){
        boolean isasc;
        if(arr[0]<arr[arr.length-1]){
            isasc=true;
        }
        else{
            isasc=false;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target ==arr[mid]){
                return mid;
            }
            if(isasc){
                if(target>arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }return-1;
    }public static int peakinmountainarray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //we are asc part of mountain array
                end=mid;
            }else{
                //we are in dsc part of mountain array
                start=mid+1;
            }
        }//will keep running until start and end point at the same value ie the peak value
        return start;
    }
}

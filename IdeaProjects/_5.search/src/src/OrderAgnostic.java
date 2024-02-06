public class OrderAgnostic {
    public static int orderAgnosticBS(int[] arr ,int start,int end,int target) {
        boolean isasc;
        if (arr[0] < arr[arr.length - 1]) {
            isasc = true;
        } else {
            isasc = false;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isasc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}

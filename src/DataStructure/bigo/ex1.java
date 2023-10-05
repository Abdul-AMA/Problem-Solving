package DataStructure.bigo;

public class ex1 {
    public static void main(String[] args) {

        int [] arr = new int[]{ 1  , 2 , 3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
        System.out.println(searchForTargetN(arr,4));
        System.out.println(searchForTargetLogn(arr,5));

    }

    public static int searchForTargetN(int [] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int searchForTargetLogn(int [] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while (right>=left){
            int mid = (left+right) / 2;
            if (target == arr[mid]){
                return mid;
            } else if (target > arr[mid]) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}

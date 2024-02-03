class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int i=0;
        int track1=0;
        int track2=0;

        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            track1++;
            i++;
        }

        while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
            track2++;
            i++;
        }
        if (track1 > 0 && track2 > 0 && i == arr.length - 1) {
            return true;
        }
        

        return false;
}
}
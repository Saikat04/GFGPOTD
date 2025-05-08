class Solution {
    public int findMissing(int[] arr) {
        // code here
        // Arrays.sort(arr);
        int size = arr.length;
        int d = arr[1] - arr[0];
        if(size == 2) return arr[1] + d;
        d = d > 0 ? Math.min(d, arr[2] - arr[1]) : Math.max(d, arr[2] - arr[1]);
        for(int i = 0; i < size - 1; i++) {
            if(arr[i + 1] != arr[i] + d) {
                return arr[i] + d;
            }
        }
        return arr[size - 1] + d;
    }
}

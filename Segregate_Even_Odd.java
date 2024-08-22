class Solution {
    void segregateEvenOdd(int arr[]) {
       int n = arr.length;
        int left = 0, right = n - 1;

        
        while (left < right)
        {
            if(arr[left] % 2 == 0)
                left++;
            
            else if(arr[right] % 2 != 0) 
                right--;
            
            // Swap if we find an even number on the right and an odd number on the left
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
      
        // At this point, left is the index where odd numbers start
        int evenEnd = left;

        // Sort the even numbers (from index 0 to evenEnd-1)
        Arrays.sort(arr, 0, evenEnd);

        // Sort the odd numbers (from index evenEnd to n-1)
        Arrays.sort(arr, evenEnd, n);
    }
}

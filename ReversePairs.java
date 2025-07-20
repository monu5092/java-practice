import java.util.*;

class ReversePairs {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums, 0, n - 1);
    }

    public int mergeSort(int[] num, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;

        int mid = low + (high - low) / 2;

        cnt += mergeSort(num, low, mid);
        cnt += mergeSort(num, mid + 1, high);
        cnt += countPairs(num, low, mid, high);
        merge(num, low, mid, high);
        return cnt;
    }

    public int countPairs(int[] num, int low, int mid, int high) {
        int cnt = 0;
        int right = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) num[i] > 2L * (long) num[right]) {
                right++;
            }
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    public void merge(int[] num, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (num[left] <= num[right]) {
                temp.add(num[left]);
                left++;
            } else {
                temp.add(num[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(num[left]);
            left++;
        }
        while (right <= high) {
            temp.add(num[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            num[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 3, 2, 3, 1};
        System.out.println("Reverse Pairs: " + sol.reversePairs(nums1)); 

        int[] nums2 = {2, 4, 3, 5, 1};
        System.out.println("Reverse Pairs: " + sol.reversePairs(nums2)); 

        int[] nums3 = {5, 4, 3, 2, 1};
        System.out.println("Reverse Pairs: " + sol.reversePairs(nums3)); 

        int[] nums4 = {1, 2, 3, 4, 5};
        System.out.println("Reverse Pairs: " + sol.reversePairs(nums4)); 
    }
}

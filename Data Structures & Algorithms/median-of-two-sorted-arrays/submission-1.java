class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> mergeList = new ArrayList<>(nums1.length + nums2.length);
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) mergeList.add(nums1[i++]);
            else mergeList.add(nums2[j++]);
        }

        while (i < nums1.length) mergeList.add(nums1[i++]);
        while (j < nums2.length) mergeList.add(nums2[j++]);

        int n =mergeList.size();

        if(n%2 == 0){
            double sol = mergeList.get(n/2 - 1) + (mergeList.get(n/2));
            return sol/2;
        }

        else{
            return mergeList.get(n/2) ;
        }
    }

}

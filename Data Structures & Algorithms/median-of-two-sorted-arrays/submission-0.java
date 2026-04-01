class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> mergedList = new ArrayList<>();

        for (int i : nums1){
            mergedList.add(i);
        }

        for(int j : nums2){
            mergedList.add(j);
        }

        Collections.sort(mergedList);

        int n =mergedList.size();

        if(n%2 == 0){
            double sol = mergedList.get(n/2 - 1) + (mergedList.get(n/2));
            return sol/2;
        }

        else{
            return mergedList.get(n/2) ;
        }
    }

}

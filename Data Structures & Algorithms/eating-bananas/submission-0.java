class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1 ,r =Arrays.stream(piles).max().getAsInt();
        while(l<r){
            int m = (l+r) / 2 , hrs = 0;

            for(int x : piles){
                hrs += (x + m -1) / m;
            }
            if(hrs>h){
                l = m + 1;
            }else{r=m;}
        }

        return l;
    }
}

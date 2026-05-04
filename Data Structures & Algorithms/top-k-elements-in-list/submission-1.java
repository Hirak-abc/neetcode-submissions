class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int n : nums) m.put(n, m.getOrDefault(n, 0) + 1);

        List<Integer> list = new ArrayList<>(m.keySet());
        list.sort((a, b) -> m.get(b) - m.get(a));

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
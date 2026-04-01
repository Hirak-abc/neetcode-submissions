class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        nums.sort()
        count = Counter(nums)
        lst = []

        for i,j in count.most_common(k) :
            lst.append(i)
        
        return lst
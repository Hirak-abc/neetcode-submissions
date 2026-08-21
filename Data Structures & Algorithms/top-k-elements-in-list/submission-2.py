class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dict = Counter(nums)
        res=[]
        for x,freq in dict.most_common(k):
            res.append(x)
        return res
from collections import Counter

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict = {}

        for i in strs:
            key = str(sorted(Counter(i).items()))

            if key not in dict:
                dict[key] = []

            dict[key].append(i)

        return list(dict.values())



class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean_text=re.sub(r'[^A-Za-z0-9]','',s).lower()
        # text=clean_text.lower()
        return clean_text==clean_text[::-1]
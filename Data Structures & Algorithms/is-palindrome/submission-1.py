class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean_text=re.sub(r'[^A-Za-z0-9]','',s)
        text=clean_text.lower()
        if text==text[::-1]:
            return True
        return False
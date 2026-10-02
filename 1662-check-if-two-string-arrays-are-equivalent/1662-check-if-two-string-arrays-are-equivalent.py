class Solution(object):
    def arrayStringsAreEqual(self, word1, word2):
        s1 =""
        s2 =""
        for s in word1:
            s1 +=s
        for s in word2:
            s2 +=s
        if s1==s2:
            return True
        else: 
            return False
        """
        :type word1: List[str]
        :type word2: List[str]
        :rtype: bool
        """
        
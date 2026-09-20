class Solution:
    def isHappy(self, n: int) -> bool:
        
        seen = set()
        
        while n != 1:
            if n in seen:
                return False
            seen.add(n)
            n = self.square(n)
        return True    


    def square(self, n: int) -> int:
        sqr =0
        while n>0:
            rem = n%10
            sqr += (rem * rem)
            n = n // 10
        return sqr        
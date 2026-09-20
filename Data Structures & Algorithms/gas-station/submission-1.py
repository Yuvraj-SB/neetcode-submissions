class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        
        ans = [0] * 2 * len(gas)
        for i in range(len(gas)):
            ans[i] = gas[i] - cost[i]
            ans[i+len(gas)] = gas[i] - cost[i]
        
        for i in range(len(gas)):
            sumans = 0
            possible = True
            for j in range(i, i + len(gas)):
                sumans += ans[j]
                if sumans < 0:
                    possible = False
                    break
            if possible:
                return i
        return -1        

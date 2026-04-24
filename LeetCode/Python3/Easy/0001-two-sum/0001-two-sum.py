class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
            seen = {}

            for i, num in enumerate(nums) :
                needNum = target - num
                
                # 딕셔너리에 needNum 이 있으면 리턴
                if needNum in seen :
                    return [seen[needNum], i]
                else :
                    seen[num] = i
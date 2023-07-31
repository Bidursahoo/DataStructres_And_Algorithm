class Solution(object):
    def minMaxDifference(self, num):
        n = len(nums)
        nums = sorted(nums)
        
        # Calculate the low and high scores for the original array
        low_score = nums[-1] - nums[0]
        high_score = max(nums[i+1] - nums[i] for i in range(n-1))
        score = low_score + high_score
        
        # Try changing the value of up to two elements and recalculate the score
        for i in range(n):
            for j in range(i+1, n):
                new_nums = sorted(nums[:i] + [nums[j]] + nums[i+1:j] + [nums[i]] + nums[j+1:])
                new_low_score = new_nums[-1] - new_nums[0]
                new_high_score = max(new_nums[k+1] - new_nums[k] for k in range(n-1))
                new_score = new_low_score + new_high_score
                score = min(score, new_score)
                
                # Check if changing one element is enough to minimize the score
                if j == i+1:
                    continue
                new_nums = sorted(nums[:i] + [nums[j]] + nums[i+1:j] + nums[j+1:])
                new_low_score = new_nums[-1] - new_nums[0]
                new_high_score = max(new_nums[k+1] - new_nums[k] for k in range(n-2))
                new_score = new_low_score + new_high_score
                score = min(score, new_score)
        
        return score
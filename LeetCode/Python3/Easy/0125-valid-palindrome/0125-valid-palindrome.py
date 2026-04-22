class Solution:
    def isPalindrome(self, s: str) -> bool:
        replace_cmd = ''.join(c for c in s if c.isalpha() or c.isdigit())

        # 빈 공백인 경우
        if replace_cmd == '' :
            return True
        # 양쪽이 일치하는 경우
        upper_cmd = replace_cmd.upper()
        upper_cmd_length = len(upper_cmd) // 2

        for i in range(upper_cmd_length) :
            end_index = len(upper_cmd)- (1 + i)
            start_index = i
            
            if upper_cmd[start_index] != upper_cmd[end_index] :
                return False  

        return True


        

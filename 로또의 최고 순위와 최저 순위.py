
def solution(lottos, win_nums):
    answer = []
    count = 0
    rk = [6,5,4,3,2,1,0]
    z_cnt = lottos.count(0)
    
    for i in win_nums:
        count += lottos.count(i)
    if 5 >= lottos.count(0) >= 1:
        answer.append(rk[count+z_cnt-1])
        answer.append(rk[count-1])
        
    if lottos.count(0) == 6:
        answer.append(rk[z_cnt-1])
        answer.append(rk[count])
        
    if lottos.count(0) == 0:
        answer.append(rk[count-1])
        answer.append(rk[count-1])
        if lottos.count(0) == count == 0:
            answer[0] = 6
            answer[1] = 6
    
    return answer


print(solution([44, 1, 0, 0, 31, 25],[31, 10, 45, 1, 6, 19]))
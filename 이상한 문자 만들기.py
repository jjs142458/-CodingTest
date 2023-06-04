def solution(s):
    answer = ''
    string = list(s)
    num = 0
    for i in string:
        if (num == 0):
            answer += i.upper()
            num = 1
        else:
            answer += i.lower()
            num = 0
        if (i == " "):
            num = 0
            
    return answer


print(solution("try hello world"))
def solution(d, budget):
    answer = 0
    d.sort()
    if sum(d) == budget:
        return len(d)
    else:
        for i in d:
            if budget - i <= 0:
                if budget == i:
                    answer += 1
                break
            budget -= i
            answer += 1

    return answer

print(solution([1,3,2,5,4],	9))
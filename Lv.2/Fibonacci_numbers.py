def Fibonacci_numbers(n):
    answer = [0,1]
    num = 0

    for i in range(n-2):
        if num == 0:
            answer[0] = sum(answer)             
            num = 1
            
        else:
            answer[1] = sum(answer)
            num = 0
            
    return sum(answer)%1234567



print(Fibonacci_numbers(3))
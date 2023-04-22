def price(price, money, count):
    answer = -1
    cnt = 0
    for i in range(1,count+1):
        cnt += price*i
        count -= 1
        if count == 0:
            if money > cnt:
                return 0
            return cnt - money
    return answer

print(price(3,20,4))
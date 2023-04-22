def max_min(s):
    answer = [int(i) for i in s.split()]
    answer = [str(min(answer)), str(max(answer))]

    return " ".join(answer)

print(max_min("1 2 3 4"))
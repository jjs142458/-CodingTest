def JDcase(s):
    answer = s.split(" ")
    a = []
    for i in answer:
        a.append(i.capitalize())

    return " ".join(a)


print(JDcase("for the last week"))
def hide_phonenumber(phone_number):
    phone_number = list(map(str,phone_number))
    
    for i in range(len(phone_number)-4):
        phone_number[i] = '*'
    
    answer = phone_number
    
    return "".join(answer)


print(hide_phonenumber("01033334444"))
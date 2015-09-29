
def parent(str):
    #declaring a couple of variables to count the number of occurencies of each parenthesis
    opener = 0
    closer = 0
    #looping through the str using for loop
    for i in str:
        if i == '(':
            opener += 1
        elif i == ')':
            closer += 1
    return opener == closer

print parent(raw_input())
    
    


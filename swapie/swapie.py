#Using python, have the function SwapCase(str) take the str parameter
#and swap the case of each character.
#For example: if str is "Hello World" the output should be hELLO wORLD.
#Let numbers and symbols stay the way they are.

#NB do not use the swapcase python method.

def SwapCase(str):
    temp = ""

    for c in str:
        if c.isupper():
            temp = temp + c.lower()
        else:
            temp = temp + c.upper()

    return temp
print(SwapCase('doNut'))
    

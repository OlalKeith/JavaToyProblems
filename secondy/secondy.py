# Using Python, have the function Secondy(lis) take the list of numbers stored in lis
# and return the second lowest and second greatest numbers, respectively, separated by a space.
# For example: if lis contains [7, 7, 12, 98, 106] the output should be 12 98.
# The list will not be empty and will contain at least 2 numbers. It can get tricky if there's just two numbers!

#create a function/method that takes a parameter of type list
def secondy(lis): 
  # code goes here
  #sort the list
  lis.sort()
  #get the second last element i.e lis[len(lis)-2] and second element lis[1]
  return lis[2],lis[len(lis)-2]
    
# keep this function call below here
print(secondy([7, 7, 12, 98, 106]))


# DOMESTIC TRADE
# LANGUAGE: PYTHON

# You have been hired by a trade company to write a program.

# They have given you a CSV (comma separated value, used in spreadsheets) file containing sales data by transaction
#for 10,000 sales transactions.

# Write a function that calculates the grand total of sales for a given item across all stores.

# Your output should be in a form of a dictionary, with total_KSH as a key and the total as a value.

# Additionally, the company wants to know which store location made the largest sales for that item. Add that as another hash key-value pair.

# Notes:
#  - Check out this website for an intro to handling CSV files

# Example:

#   Given a `TRANS.csv` of:

#   store,sku,amount
#   Nairobi,DM1210,7000 KSH
#   Nairobi,DM1182,1968 KSH
#   Naivasha,DM1182,5858 KSH
#   Mombasa,DM1210,6876 KSH
#   Nakuru,DM1182,5464 KSH

# If we enter 'DM1182', you program should return:
# {:total_KSH=> 13290, :largest=> 'Nairobi'}.
#import csv
#def domestic_trade(itemId):
  # Your Code Here!

#domestic_trade("DM1724")
store = {
    "Nairobi": 7000, 
    "Nairobi":1968, 
   "Naivasha":5858, 
    "Mombasa":6876, 
    "Nakuru":5464 ,
        }
#itemId = {
    #"DM1210":7000, 
    #"DM1182":1968, 
    #"DM1182":5858, 
    #"DM1210":6876, 
    #"DM1182":5464, 
  #}
total = 0  
for key in store:
      print key
      print "store: %s" % store[key]
      #print "itemId: %s" % itemId[key]

      total = total + store[key] 

print key
print total

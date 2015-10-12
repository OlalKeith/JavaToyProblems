# Using the Python, have the function CaesarCipher(str,num) take the str parameter and perform a Caesar Cipher shift
# on it using the num parameter as the shifting number.
# A Caesar Cipher works by shifting each letter in the
# string N places down in the alphabet (in this case N will be num).
# Punctuation, spaces, and capitalization should remain intact.
# For example if the string is "Caesar Cipher" and num is 2 the output should be "Ecguct Ekrjgt".

# to read more about ceaser's cipher visit http://practicalcryptography.com/ciphers/caesar-cipher/ or google some more
# happy coding :-)

plaintext = input('Enter message')
alphabet = "abcdefghijklmnopqrstuvwxyz"


num = 2

cipher = ''


for c in plaintext:
    if c.isalpha():
        cipher += alphabet[(alphabet.index(c)+ num)]
    else:
        cipher+= c

print ('Your encryted message is:' + cipher)    

# Given a roman numeral as input, write a function that converts the roman
# numeral to a number and outputs it.
#
# Ex:
# translateRomanNumeral("LX") # 60
#
# When a smaller numeral appears before a larger one, it becomes
# a subtractive operation. You can assume only one smaller numeral
# may appear in front of larger one.
#
# Ex:
# translateRomanNumeral("IV") # 4
#
# You should return `nil` on invalid input.


#import module roman
import roman
#Function definition is here

def arabic_numerals(roman_numerals):
    try:
        return roman.fromRoman(roman_numerals.upper())
    except:
        return None

print arabic_numerals("LX")


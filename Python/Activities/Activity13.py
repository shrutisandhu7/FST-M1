def sumlist(listinput):
   sumnumbers = 0

   for x in listinput:
        sumnumbers+=x
   return sumnumbers 

inputlist = [int(item) for item in input("Enter the list items : ").split()]

print("List: ",inputlist)  
result = sumlist(inputlist)
print("Sum of elements of list: ",str(result))
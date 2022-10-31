list = []
#Add space- separated elements
list = [int(item) for item in input("Enter the list items : ").split()]
print("List: ",list)  

sum = 0
for number in list:
  sum += int(number)

print("Sum of elements: ",sum)
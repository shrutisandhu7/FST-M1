list1 = []
list2 = []

list1 = [int(item) for item in input("Enter the list1 items : ").split()]
print("List1: ",list1)

list2 = [int(item) for item in input("Enter the list2 items : ").split()]
print("List2: ",list2)  

print("-----Solving Problem------")
# Print the lists
print("First List ", list1)
print("Second List ", list2)

# ResultList
thirdList = []

for num in list1:
    if (num % 2 != 0):
        thirdList.append(num)
        
for num in list2:
    if (num % 2 == 0):
        thirdList.append(num)

# Print result
print("Result List is:")
print(thirdList)
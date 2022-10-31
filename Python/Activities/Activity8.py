list = []
#Add space- separated elements
list = [int(item) for item in input("Enter the list items : ").split()]
print("List: ",list)  

firstElement = list[0]
# Get last element
lastElement = list[-1]

# Check if first and last element are equal
print("Are first and last elements same?:")
if (firstElement == lastElement):
    print(True)
else:
    print(False)
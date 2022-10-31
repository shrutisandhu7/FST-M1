user_input = input('Enter space-separated integers: ')

my_tuple = tuple(int(item) for item in user_input.split())

print(my_tuple)

# Print elements that are divisible by 5
	
print("Elements that are divisible by 5:")
	
for num in my_tuple:
	
    if (num % 5 == 0):
	
        print(num)



def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-1) + fibonacci(number-2))

n = int(input("Enter a number: "))

if n <= 0:
    print("Enter a positive number")
else:
    print("Fibonacci Series: ")
    for i in range(n):
        print(fibonacci(i))
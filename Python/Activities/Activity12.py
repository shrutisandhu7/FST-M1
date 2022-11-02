def sum(n):
    if (n == 0 or n < 0):
        return 0 
    else:
        return n + sum(n-1)
          
print("Sum of numbers from 0 to 10 is: ", sum(10))
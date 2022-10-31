from re import A
from secrets import choice


user1 = input("Enter Player1 name: ")
user2 = input("Enter Player2 name: ")

choice1 = input(user1 +" choose from rock, paper, scissors: ").lower()
choice2 = input(user2 +" choose from rock, paper, scissors: ").lower()

if(choice1 == choice2):
    print("It's a draw")
elif(choice1=="rock"):
    if(choice2=="paper"):
        print(user2 +" wins!")
    else:
        print(user1 +" wins!")
elif(choice1=="paper"):
    if(choice2=="rock"):
        print(user1 +" wins!")
    else:
        print(user2 +" wins!")
elif(choice1=="scissors"):
    if(choice2=="rock"):
        print(user2 +" wins!")
    else:
        print(user1 +" wins!")
else:
    print("invalid choice")
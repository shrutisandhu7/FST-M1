import pandas
dataframe = pandas.read_csv('userpass.csv')

print(dataframe)

print(dataframe["Usernames"])

print("Username is: "+dataframe["Usernames"][1] + ", Password is: " +dataframe["Passwords"][1])

print(dataframe.sort_values("Usernames"))

print(dataframe.sort_values("Passwords", ascending = False))
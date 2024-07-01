# Author: Thanushkar Sivakumar
# Email: thanushkarsivakumar@gmail.com
# Date: Jul - 01 - 2024

#Description: Find the particular day of a week by combaring with other date and day of the week.


day = {1: "Sunday", 2: "Monday", 3: "Tuesday", 4: "Wednesday", 5: "Thursday", 6: "Friday", 7: "Saturday"}
month = {1: ['jan', 31], 2: ['feb', 28], 3: ['mar', 31], 4: ['apr', 30], 5: ['may', 31], 6: ['jun', 30], 7: ['jul', 31], 8: ['aug', 31], 9: ['sep', 30], 10: ['oct', 31], 11: ['nov', 30], 12: ['dec', 31]}

print("1. Sunday \n2. Monday \n3. Tuesday \n4. Wednesday \n5. Thursday \n6. Friday \n7. Saturday")
no_day = int(input("Choose the week: "))
date = input("Enter the Date (DD/MM/YYYY): ")
date = list(int(x) for x in date.split('/'))

print("\nWhich week you want: ")
w_date = input("Enter the Date (DD/MM/YYYY): ")
w_date = list(int(x) for x in w_date.split('/'))

sum = 0
if date[2] == w_date[2]:
    for i in range(date[1], w_date[1]):
        sum += month[i][1]

    add = sum + w_date[0] - date[0]
    find = add % 7
    day_d = (no_day + find)%7


else:
    for i in range(date[1], 13):
        sum += month[i][1]

    for j in range(1, w_date[1]):
        sum += month[j][1]

    add = sum + w_date[0] - date[0]
    find = add % 7
    day_d = (no_day + find) % 7

print("\n%s, %s %d, %d" % (day[day_d], month[w_date[1]][0].title(), w_date[0], w_date[2]))
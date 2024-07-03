# Author: Thanushkar Sivakumar
# Email: thanushkarsivakumar@gmail.com
# Date: Jul - 1 - 2024

# Description: Find a day of the week

import datetime

x = input("MM/DD/YYYY ")
x = list(int(i) for i in x.split('/'))

y = datetime.datetime(x[2],x[0],x[1])
print(y.strftime("%A"))

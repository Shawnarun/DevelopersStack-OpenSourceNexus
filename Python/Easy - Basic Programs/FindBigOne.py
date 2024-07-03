# Author: Thanushkar Sivakumar
# Email: thanushkarsivakumar@gmail.com
# Date: Jun - 24 - 2024

# Description: Find Big One in 3 different inputs

N1 = int(input("Enter Number 1: "))
N2 = int(input("Enter Number 2: "))
N3 = int(input("Enter Number 3: "))

if N1 > N2:
    if N1 > N3:
        print("%d is the largest" %(N1))
    else:
        print("%d is the largest" %(N3))

elif N2 > N3:
    print(f"%d is the largest" %(N2))

else:
    print(f"%d is the largest" %(N3))
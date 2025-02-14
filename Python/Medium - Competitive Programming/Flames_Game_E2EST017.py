"""
Created on Sat Feb  8 17:48:00 2025

@author: thomars thuvarangan

description:FLAMES game that tells the relationship type using FLAMES letters.
F-Friend
L-Love
A-Affection
M-Marriage
E-Enemies
S-Siblings

function example:if the inputs are thomars and malindi, the remaining unmatched letters are t,h,o,r,s and l,i,n,d,i (10).
Now from F to S in FLAMES, each letter will be removed according to the remaining letters count. For example, in 1st attempt,
M will be removed and counting starts from next letter and this process happens until only 1 letter remains in FLAMES. 
So the output will be L for these inputs.
"""

def remove_common_letters(person1,person2):
    list1 = list(person1)
    list2 = list(person2)
    common_letters=0
    
    for i in range(len(list1)):
        for j in range(len(list2)):
            if list1[i]==list2[j]:
                common_letters+=1
                list2[j]="-" #to avoid comparing with same letter if a letter matched in name1
                break
    print("Common Letters:",common_letters)
    remaining_letters = (len(list1) + len(list2)) - (2 * common_letters)
    print("Remaining Letters:",remaining_letters)
    return remaining_letters

print("--------------------FLAMES GAME----------------------")
person1=input("Enter 1st Name:").lower().replace(" ","")
person2=input("Enter 2nd Name:").lower().replace(" ","")
print("-----------------------------------------------------")
count_remaining=remove_common_letters(person1,person2)


def remove_flames_letters(count_remaining):
    flames=["F","L","A","M","E","S"]
    if(count_remaining>0):
        while len(flames) > 1:
            index = (count_remaining % len(flames)) - 1
            if index >= 0:#for + index
                print("---------------------------------")
                print("Removed Letter:",flames.pop(index))
                #print(flames)
                flames = flames[index:] + flames[:index]#to start from next letter after removed.
                #print(flames)
            else:#for - index
                print("---------------------------------")
                print("Removed Letter:",flames.pop())
        print("---------------------------------")
        return flames[0]
    else:
        print("-----------------------------------------------------")
        return "No FLAMES!!"
results_key=remove_flames_letters(count_remaining)

print("Final Results:",results_key)
flames_dictionary={"F":"Friends",
                   "L":"Love",
                   "A":"Affection",
                   "M":"Marrriage",
                   "E":"Enemy",
                   "S":"Sibilings"
}
final_results=flames_dictionary[results_key] if results_key in flames_dictionary else "No Flames for You both!"
print("###########################")
print(person1,"&",person2,"=",final_results)
print("###########################")




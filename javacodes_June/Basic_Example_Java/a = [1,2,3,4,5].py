a = [1,2,3,4,5]

target =6





def code(a,target):
    dict ={}
    for i, j in enumerate(a):
        comp = target - j

        if comp in dict:
            return [dict[comp], i]
        
        else:
            dict[j] = i


value = code(a,target)
print(value)



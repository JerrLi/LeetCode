

def minDominoRotations(tops, bottoms):
    """
    :type tops: List[int]
    :type bottoms: List[int]
    :rtype: int
    """
    n = len(tops)
    Count=[0 for i in range(7)]

    for e in tops:
        Count[e]+=1
        
    for k in bottoms:  
        Count[k]+=1


    max=-1
    maxIdx =-1
    for i in range(1,7):
        if Count[i]>max:
            max = Count[i]
            maxIdx = i


    numTop=0
    numBot=0
    for i in range(n):
        if (tops[i] != maxIdx and bottoms[i] != maxIdx):
            return -1

    for i in range(n):
        if tops[i] == maxIdx:
            numTop+=1

    for i in range(n):  
        if bottoms[i] == maxIdx:
            numBot+=1

    final = [n-numTop,n-numBot]
    return min(final)



tops = [1,2,1,1,1,2,2,2]
bottoms = [2,1,2,2,2,2,2,2]



rtn = minDominoRotations(tops,bottoms)
print(rtn)
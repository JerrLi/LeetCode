def brokenCalc(startValue, target):
    """
    :type startValue: int
    :type target: int
    :rtype: int
    """
    a= startValue
    b= target

    res = 0

    if a==b:
    	res= 0
    if a>b:
    	res= a-b

    if a<b:
    	if (b % 2) == 1:
    		return 1+brokenCalc(a,b+1)
    	else:
    		if a<(b/2):
    			res = 1+brokenCalc(a,b/2)
    		else:
    			res = 1+a-b/2

    print(a,b,res)
    return res


a=6
b=80000
t=brokenCalc(a,b)
print(t)
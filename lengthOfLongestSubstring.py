def lengthOfLongestSubstring(s):
    res=0
	max=0
	cur=[]
	for e in s:
		if e in cur:
			if res>max:
				max=res
			cur=[]
			cur.append(e)
			res=1
		else:
			cur.append(e)
			res+=1

	print(res)





s = "pwwkew"
print(lengthOfLongestSubstring(s))
def numRescueBoats(people, limit):
	"""
	:type people: List[int]
	:type limit: int
	:rtype: int
	"""
	people.sort()

	light = 0
	heavy = len(people)-1

	res=0

	while light<heavy:
		if people[light] + people[heavy] <= limit:
			light += 1
		res+=1
		heavy-=1

	if light==heavy:
		res+=1	

	return res



people = [3,2,2,1]
limit = 3
print(numRescueBoats(people,limit))
def list = [1,2,3]
println list+[1]
println list<<1
println list-[1]
println list*2
println list.reverse()
println list.disjoint([4,5,6])
println list.intersect([4,3,1])
println list.collect{it+3}
list = [1,[2,3]]
println list.flatten()

list = [1,2,3,1]
println list.unique().size()
println list.count(1)
println list.sort()
list = [1,2,3,4]
println list.min()
println list.max()
println list.sum()

println list.grep{it<3}


println list.findAll{it%2==0}

categories = [1:'Up', 2:'Up', 3:'Down',	4: 'Up', 5: 'Up', 6: 'Down', 7: 'Down',	8: 'Up', 9: 'Down',	0: 'Down']



def mapsOfCities = [
	[name:'A', city: 'London'],
	[name: 'B', city: 'Bengaluru']
	]
	
	def mapsOfCollection = mapsOfCities.groupBy{it.city}
	println mapsOfCollection

categories = [1:'Up', 2:'Up', 3:'Down',	4: 'Up', 5: 'Up', 6: 'Down', 7: 'Down',	8: 'Up', 9: 'Down',	0: 'Down']
///categories1 = [[name: 1, val:'Up'], [name: 2,val:'Up'], [name:3,val:'Down'],[name:4,val: 'Up'],[name: 5,val: 'Up'],[name: 6, val: 'Down'],[name: 7, val: 'Down'],[name:	8, val: 'Up'],[name: 9,val: 'Down'],[name:	0,val: 'Down']]
def findCategories(list)
{
	
	def countUp =0;	def countDown=0; def countNone =0;
	def category = list.collect{categories[it]}
	println category
	def mapsOfCollection = category.groupBy{it}
	
	println mapsOfCollection
	def tc = mapsOfCollection.collect{k,v -> ["$k":v.size()]}.each{m->m.each{ k, v -> if(k=="null") k='None'; println "$k->$v"}}
//	countUp = tc[0].collect{it.value}
//	countNone = tc[1].collect{it.value}
//	countDown = tc[2].collect{it.value}
	
	//println categories.collect{it.key}.intersect(list)
	//mapsOfCollection.
//	for(x in list)
//	{
//		//(categories[x]!=null)?(categories[x]=="Up"?countUp++:countDown++):countNone++;
//		if(categories[x]!=null)
//		{
//			categories[x]=="Up"?countUp++:countDown++;
//			println "${x} is ${categories[x]}"
//		}
//		else
//		{
//			countNone++;
//			println "None value is ${x}"
//		}
//	}
//	println "==============================="
//	println "Up values count is ${countUp}"
//	println "Down values count is ${countDown}"
//	println "None values count is ${countNone}"
}
def list1 = [4,15,16,1,19,01, 11,0,9]
findCategories(list1)
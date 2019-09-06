import static java.lang.Math.*

def doubleNum = {num->num*2}
println doubleNum(3)

processThenPrint ={num, closure -> num = closure(num); println "number is $num"}

processThenPrint(3,doubleNum)
processThenPrint(10, {it/2})
processThenPrint(10) {it/5}

piA = {22/7}

piB = {333/106}
piC = {355/113}


howCloseToPI = {abs(it.value() - PI)}
algorithms = [piA:piA, piB:piB, {333/106}: piC]

findBestPI(algorithms)
 
def findBestPI(map){
	map.entrySet().sort(howCloseToPI).each{
		entry-> def diff= howCloseToPI(entry)
		println "Algorithm $entry.key differs to $diff"
	}
}


10.times{println 'Hi'}
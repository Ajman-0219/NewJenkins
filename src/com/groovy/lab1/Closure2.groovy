import static java.lang.Math.*

def doubleNum = {num->num*2}
echo doubleNum(3)

processThenPrint ={num, closure -> num = closure(num); echo "number is $num"}

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
		echo "Algorithm $entry.key differs to $diff"
	}
}


10.times{echo 'Hi'}
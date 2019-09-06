int add(int num1, int num2)
{
	return num1+num2
}

def sub(num1, num2)
{
	println num1
	return num1-num2
}


println add(5,3)

println sub(11, 6)
println "=============="
def methodtest (a1, ... vals)
{
	println a1
	println vals[0]
}


println "testing :"+ methodtest("Hello", "Ajith Shenoy K")


methodtest "df", "pd"

sub 4,5


for (x in 1 .. 5)
	println x
	
	for (i in 0 ..<2){
		for (j in 0 ..<2){
		println "Multi 2 loops :${i},${j}"
		}
		}
		
		def arr =[1,3,5,7]
		
		println(arr[0])
		println(arr[2])
		println(arr[-1])
		println(arr[-2])
		nos = [1,2,3]
		nos[1..2]=[4,5]
		println nos
		
		count = 0
		while(count<5)
		{
			println count
			count++
		}
		
		nos = [1,2,3,4,5,'kolkata', 'BENGALURU']
		
		nos+= ['A','B','C']
		
		println nos
		
		nos-= ['A','B','C']
		println nos
		
		chars = ['a',3]
		
		println (chars*3)
		
		
		def prime = []
		
		prime.add(1)
		prime.add(3)
		
		println prime[0] 
		
		def designations = [
			11: "SVP",
			10: "VP",
			9: "AVP",
			8: "Sr. Manager",
			7: "Manager"]
		
		println designations[10]
		
		designations[10] = 'Vice President'
		
		println designations[10]
		
		def test = [:]
		
		test.put(404, "Page not found")
		test.put(401, "Invalid page")
		
		println test[401]
		
		def languages = ['Java', 'Python', 'C#', 'Groovy']
		println languages.reverse()
		println languages
		println languages.sort(false)
		println languages
		println languages.reverse()
		println languages
		println languages.sort(true)
		println languages
		
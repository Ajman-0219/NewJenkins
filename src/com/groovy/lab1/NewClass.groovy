list1 = [1,4,6,7]
list2 = [6,5,7,6]

def functionCall(list1, list2, parameter1)
{
	int sum=1
	if(parameter1)	
	{
		sum=0
		sum= list1.sum()
//		for(x in list1)
//			sum+=x;
			
		println "Sum of list1 is ${sum}"
	}		
	else
	{
		
	sum = mul(list2)
//		list2.forEach{
//		sum =sum*it
//		}
//		for(x in list2)
//			sum*=x
			
		println "Multiplication of list2 is ${sum}"
	}
			
verifySum(sum, list1, list2)
			
}

def mul(list)
{
	list.inject(1, {a,b->a*b})
}

def verifySum(sum, list1, list2)
{
	if(sum>100)
		{
			list2+=list1;
			println "Resulted value is greater than 100 \n"+list2
		}
		else
		{
			list1+=list2;
			println "Resulted value is lesser than 100 \n"+list1
		}
}

functionCall(list1, list2, false)
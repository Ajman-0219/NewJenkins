import org.omg.CORBA.Environment

import groovyjarjarasm.asm.tree.MultiANewArrayInsnNode

println 'Hello Ajith'

def no=1
no = 'ABC'
println no

def (name, org, age, dob) = ["Ajith", "Siemens", 30, "04-OCT-1988"]

println "Name: ${name} \nOrg: ${org} \nAge: ${age} \nDOB: ${dob}\n"

println age+1

def me = [name:"Ajith Shenoy K", org: "Siemens (IOT)",age: 30,dob: "02-OCT-1988"]

println "Name: ${me.name} \nOrg: ${me.org} \nAge: ${me.age} \nDOB: ${me.dob} & ${dob}\n"

for (num in me)
	println "num "+num
	

def arraySingle = ["Ajith", 30, 'Uday']
println "\n"+arraySingle[2]
println arraySingle[1]
println arraySingle[0]
println arraySingle.size()


def multiArray = [["A","K"], ["U","K"]]
println multiArray[0][0]+multiArray[0][1]
println multiArray[0].size()
println multiArray[0][0].size()
println multiArray.size()


for (num in multiArray){
	println "Multi "+ num
	}
	
	for (i in 0 ..<2){
		for (j in 0 ..<2){
		println "Multi 2 loops :"+ multiArray[i][j]
		}
		}
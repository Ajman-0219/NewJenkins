package com.groovy.lab1
//
//enum destinations {
//printer,
//console,
//external_Service,
//etc
//}
//
//
//def printData(UserData udata, destination) {
//	def uDt= udata
//	
//	
//	selectedDestination(destination)
//	println "User First Name : ${uDt.firstName}"
//	println "User Last Name : ${uDt.lastName}"
//}
//
//
//printData(new UserData("Ajith","Shenoy"), destinations.console)
//
//class UserData{
//	def firstName;def lastName;
//	
//	UserData(fName, lName)
//	{
//		this.firstName = fName
//		this.lastName = lName
//	}
//	
//}
//
//def selectedDestination (desti)
//{
//	switch(desti)
//{
//	case destinations.printer:
//	println "User selected destination as printer"
//	break
//	
//	case destinations.console:
//	println "User selected destination as console"
//	break
//	
//	case destinations.external_Service:
//	println "User selected destination as service"
//	break
//}
//}



//def printData = {destination -> println "Destination is ${destination}"}

def printer = {destination -> println "Destination is Printer"}
def console = {destination -> println "Destination is Console"}

def funct = {userInfo, printInfo, destination ->  destination(printInfo(userInfo))}


funct([FirstName: "Ajith", LastName: "Shenoy"],
	{x-> println "User First Name :${x.FirstName}\nUser Last Name :${x.LastName}"},
	{y-> printer(y)}
)

println ""

funct([FirstName: "Uday", LastName: "Kumar"],
	{x-> println "User First Name :${x.FirstName}\nUser Last Name :${x.LastName}"},
	{y-> console(y)}
)
//println ""
//funct(["Aj","SK"],
//	{x-> println "User First Name :${x[0]}\nUser Last Name :${x[1]}"},
//	{y-> printData("External Service")}
//)
println ""
def printerCollector = funct.rcurry(printer)
printerCollector(["UK","G"],
	{x-> println "User First Name :${x[0]}\nUser Last Name :${x[1]}"})

println ""
def consoleCollector = funct.ncurry(2, console)
consoleCollector(["UK","Aj"],
	{x-> println "User First Name :${x[0]}\nUser Last Name :${x[1]}"})
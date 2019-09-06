package com.groovy.lab1

class Human{
	def talk(words)
	{
		echo words
	}
}

class Staff extends Human {
	def name; def age
	
	Staff(name, age){
		this.name = name
		this.age = age
		}
	def	increaseAgeBy(incAge)
	{
		this.age +=	incAge;
	}
	
	def printInformation()
	{
		echo "Name is ${this.name} and Age is ${this.age}"
	}
}


class Employee {
	def name; def age
	
	Employee(name, age){
		this.name = name
		this.age = age
		}
	def	increaseAgeBy(incAge)
	{
		this.age +=	incAge;
	}
	
	def printInformation()
	{
		println "Name is ${this.name} and Age is ${this.age}"
	}	
}


def employee = new Staff("Ajith", 30)
employee.talk("Hello World")
employee.increaseAgeBy(5)
employee.printInformation()
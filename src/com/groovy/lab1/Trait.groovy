package com.groovy.lab1

trait Flyable{
	def fly()
	{
		println "I can fly"
	}
}

trait Runnable{
	def run()
	{
		println "I can run"
	}
}

class Birds implements Flyable, Runnable {

}

def bird = new Birds()
bird.fly()
bird.run()
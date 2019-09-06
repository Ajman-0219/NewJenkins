import java.io.File

def storeData(fileName, data){
	new File(fileName).withWriter{
	writer->writer.writeLine(data)
	}	
}

def readFile(fileName){
	def read = new File(fileName)
	read.text
}

def findFileSize(fileName){
	new File(fileName).length()
}

def createDirectory(dirName){
	def file = new File(dirName)
	file.mkdir()
} 

def deleteFile(fileName){
	def file = new File(fileName)
	file.delete()
}

def copy(source, destination){
	def src = new File(source)
	def dest = new File(destination)
	dest<< src.text
}

def listDir(dirName){
	new File(dirName).eachFileRecurse(){
		file-> println file.getAbsolutePath()
	}
}

def fileName = "C:/Users/Administrator/Desktop/Ajith/testing.txt"
def destName = "C:/Users/Administrator/Desktop/Ajith/testCopy.txt"
def delFileNAme = "C:/Users/Administrator/Desktop/Ajith/test.txt"
def SubDir = "C:/Users/Administrator/Desktop/Ajith/Sub"
def listDirect = "C:/Users/Administrator/Desktop/Ajith"

storeData(fileName, "Hello World")
println "Data stored is ${readFile(fileName)}"
println "File size is ${findFileSize(fileName)}"
copy(fileName, destName)
println "File size is ${findFileSize(destName)}"
createDirectory(SubDir)
listDir(listDirect)
deleteFile(SubDir)

import java.io.File

def storeData(fileName, data){
	def str = readFile(fileName)
	str+="\n"+data
	new File(fileName).withWriter{
	writer->writer.write(str)
	}	
}

def readFile(fileName){
	def read = new File(fileName)
	read.readLines()
}


def createDirectory(dirName){
	def file = new File(dirName)
	file.mkdir()
} 



//def writeDevices={deviceId, name , location-> storeData(deviceLog, deviceId+","+name+","+location)}
//writeDevices(2, "D1", "Bengaluru")
//writeDevices(3, "D2", "Delhi")
//writeDevices(4, "D3", "Delhi")
//writeDevices(5, "D4", "Bengaluru")
//writeDevices(6, "D5", "Bengaluru")
//
//def writeEvents={eventId,deviceId, eventDescription-> storeData(locationLog, eventId+" "+deviceId+" "+eventDescription)}
//writeEvents(1, 5, "D5Fault")
//writeEvents(2, 3, "D1Error")
//writeEvents(3, 6, "D2TEst")
//writeEvents(4, 2, "D3Error")
//writeEvents(5, 4, "D4Fault")
//writeEvents(6, 6, "D5Information")
//def readLogs={location-> readlogs(locationLog)}

deviceLog = "./jenkins/Devices.txt"
locationLog = "./jenkins/EventLog.txt"


def readlogs(devLog){readFile(devLog).collect{x-> x.split(" ")}}

def readDeviceLocation(location, devices) {devices.findAll{ it[2] == location}.collect{it[0]}}
	
def readEventsdeviceIds(device, events) {
		for(x in device){println events.findAll{it[1] == x}}//.collect{it}}
	}


def checkLog(location){
	def readDevlog = readlogs(deviceLog)
	def readEventlog = readlogs(locationLog)
	
	def devices = readDeviceLocation(location, readDevlog)
	readEventsdeviceIds(devices, readEventlog)
}

checkLog("Bengaluru")
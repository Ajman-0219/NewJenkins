pipeline{
    agent any
    stages{
        stage('One'){
            steps{
                echo 'Loading External file'
            script{
                def echoer = load "./src/com/groovy/lab1/Assignment7.groovy" //"./jenkins/echoer.groovy"
                echoer.echoIt('Hello World')
            }
            echo 'Loading File and Called'
            sh "echo HEllo from the shell"
            sh "hostname"
            sh "uptime"
            }

        }
        stage('Two'){
            steps{
                script{
                    def disk_size = sh(script: "df / --output=avail | tail -1",
                    returnStdout: true).trim() as Integer
                    println("disk_size = ${disk_size}")
                }

            }

        }

    }

}

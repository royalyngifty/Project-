pipeline {
    environment {
        PATH = "C:\\WINDOWS\\SYSTEM32;C:\\Tools\\Java\\jdk-14.0.2\\bin"
    }
    agent {
        node { label "Group1" }
    }
    tools {
        maven 'Maven dator'
    }
    stages {
        stage ('Build') {
           steps {
                bat 'mvn clean install'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
        stage ('Run Jmeter tests') {
            steps {
                bat 'C:\\Tools\\apache-jmeter-5.3\\bin\\jmeter.bat -Jjmeter.save.saveservice.output_format=xml -n -t C:\\Tools\\Project-\\performance\\PrestShop.jmx -l jmeter_report.jtl'
                perfReport 'jmeter_report.jtl'
            }
        }
    }
}
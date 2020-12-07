pipeline {
    environment {
        PATH = "C:\\WINDOWS\\SYSTEM32"
    }
    agent {
        node { label "Group1" }
    }
    tools {
        maven 'Maven dator'
//        jdk 'jdk8'
    }
    stages {
//        stage ('Build') {
//            steps {
//                bat 'mvn clean install'
//            }
//            post {
//                success {
//                    junit 'target/surefire-reports/**/*.xml'
//                }
//            }
//        }
        stage ('Run Jmeter tests') {
            steps {
                //bat 'rmdir /s /q C:\\Tools\\Project-\\performance\\output'
                bat 'set PATH=%PATH%;C:\\Program~1\\Java\\jre1.8.0_25'
                bat 'C:\\Tools\\apache-jmeter-5.4\\bin\\jmeter.bat -n -t C:\\Tools\\Project-\\performance\\PrestShop.jmx -l C:\\Tools\\Project-\\performance\\output\\log -e -o C:\\Tools\\Project-\\performance\\output'
            }
        }
    }
}
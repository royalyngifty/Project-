pipeline {
    environment {
        PATH = "C:\\WINDOWS\\SYSTEM32;C:\\Tools\\Java\\jdk-14.0.2\\bin"
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
                //bat 'rmdir /s /q C:\\Tools\\Project-\\performance\\output || exit'
                bat 'C:\\Tools\\apache-jmeter-5.4\\bin\\jmeter.bat -Jjmeter.save.saveservice.output_format=xml -n -t C:\\Tools\\Project-\\performance\\PrestShop.jmx -l C:\\Tools\\Project-\\performance\\output\\log -e -o C:\\Tools\\Project-\\performance\\output'
            }
        }
        stage ('PerfReport') {
            perfReport modeThroughput: true, sourceDataFiles: '**/*.jtl'
        }
    }
}
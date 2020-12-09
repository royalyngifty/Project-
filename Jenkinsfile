pipeline {
    environment {
        PATH = "C:\\WINDOWS\\SYSTEM32;C:\\Tools\\Java\\jdk-14.0.2\\bin"
    }
    agent {
        node { label "G1-Uwa" }
    }
    tools {
        maven 'Maven 3.3'
        jdk 'jdk8'
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

    }
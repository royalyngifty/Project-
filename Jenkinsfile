pipeline {
    environment {
        PATH = "C:\\WINDOWS\\SYSTEM32;"
    }
    agent {
        node { label "G1-Uwa" }
    }
    tools {
        maven 'Maven 3.3.6'
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
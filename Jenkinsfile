pipeline {
    environment {
        PATH = "C:\\WINDOWS\\SYSTEM32; C:\Program Files\Java\jdk-14.0.2"
    }
    agent {
        node { label "Group1" }
    }
    tools {
        maven 'Maven dator'
      //jdk 'jdk8'
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
    }

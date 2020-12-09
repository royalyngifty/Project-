pipeline {
    environment {
        PATH = "C:\\WINDOWS\\SYSTEM32;C:\\Program Files\\Java\\jdk1.8.0_271"
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

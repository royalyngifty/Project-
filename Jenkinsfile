pipeline {
    environment {
        PATH = "C:\\WINDOWS\\SYSTEM32;C:\\ProgramFiles\\Java\\jdk1.8.0_271"
    }
    agent {
        node { label "G1-Uwa" }
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

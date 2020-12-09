pipeline {
    environment {
      PATH = "C:\\WINDOWS\\SYSTEM32;"
    }
    agent {
        node { label "G1-Uwa" }
    }
    tools {
        maven 'Maven 3.maven_3_6_3'
        jdk 'jdk8'
    }

    stages {
        stage ('Build') {
            steps {
                withMaven(maven: 'maven_3_6_3')    //        bat 'mvn clean install'
                sh 'mvn clean compile'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
           }
   }

    }
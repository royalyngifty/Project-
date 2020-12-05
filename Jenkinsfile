pipeline {
    agent {
        node { label "Group1" }
    }
    stages {
        stage ('Build') {
            steps {
                mvn clean install
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
    }
}
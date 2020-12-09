

    pipeline {


        agent {label 'Group1'}



        tools {
          maven 'Maven dator'

        }
        options { timestamps () }

     environment {
        PATH = "C:\\WINDOWS\\SYSTEM32" //"C:\\WINDOWS\\SYSTEM32;C:\\Program Files\\Java\\jdk1.8.0_271"
    }

         stages {
            stage("build") {
                steps {



                    bat "mvn -Dmaven.test.failure.ignore=true clean compile"
                }
            }


            stage("deploy") {
                steps {
                    echo 'deploying the application...'
                    bat "mvn -Dmaven.test.failure.ignore=true install"
                }
            }
        }
         post {
            always {
                echo 'This will always run'
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
                junit '**/target/surefire-reports/TEST-*.xml'
            }

         }


    }




pipeline {
    agent any
    options {
        timeout(time: 20, units: 'MINUTES')
        ansiColor('xterm')
    }
    stages {
        stage('First stage') {
            steps {
                script {
                    echo "In the first stage"
                }
            }
        }
        stage('Second stage') {
            steps {
                script {
                    echo "In the second stage"
                }
            }
        }        
    }
}
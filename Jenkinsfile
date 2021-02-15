pipeline {
    agent any
    options {
        skipDefaultCheckout(true)
    }
    stages {
        stage('Initialize') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'sudo cp -r ./target/*.jar /opt/demo/'
            }
        }
    }
}
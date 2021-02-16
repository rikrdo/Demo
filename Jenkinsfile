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
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'mvn clean install'
                sh 'sudo service demo stop'
                sh 'sudo cp  ./target/*.jar /opt/demo/test.jar'
                sh 'sudo service demo start'
                sh 'sleep 10'
            }
        }
    }
}
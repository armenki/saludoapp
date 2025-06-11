pipeline {
    agent any
    tools {
        maven 'Maven'
        jdk 'JDK17'
    }
    stages {
        stage('Clonar') {
            steps {
                git url: 'https://github.com/armenki/saludoapp.git', branch: 'main'
            }
        }
        stage('Compilar') {
            steps {
                bat 'mvn clean compile'
            }
        }
        stage('Probar') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Empaquetar') {
            steps {
                bat 'mvn package'
            }
        }
    }
    post {
        success {
            echo "🎉 El build fue exitoso"
        }
        failure {
            echo "💥 El build falló"
        }
    }
}
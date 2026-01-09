pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    credentialsId: 'github-token',
                    url: 'https://github.com/gulshan-notify/your-repo.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}

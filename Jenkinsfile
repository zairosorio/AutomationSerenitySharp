pipeline {
    agent{label 'master'}

    stages {
        stage('test') {
            steps {
                sh 'gradle clean test aggregate'
            }
        }
    }
}
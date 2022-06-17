pipeline {
  agent any
  stages {
    stage('Build-Test') {
      parallel {
        stage('Build-Test') {
          steps {
            bat 'mvn test -P smoke'
          }
        }

        stage('API Tests') {
          steps {
            bat 'echo \'API Tests Running\''
          }
        }

      }
    }

    stage('Archieving') {
      steps {
        bat 'echo \'Archieving\''
      }
    }

  }
}
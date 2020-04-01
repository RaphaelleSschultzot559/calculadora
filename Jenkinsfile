pipeline {
  agent {
    node {
      label 'slave-builder'
    }

  }
  stages {
    stage('Build') {
      steps {
        git(url: 'https://github.com/RaphaelleSschultzot559/practicafinal.git', poll: true)
        sh 'mvn -Dmaven.test.failure.ignore=true clean package'
        junit(testResults: '**/target/surefire-reports/TEST-*.xml', allowEmptyResults: true)
        archiveArtifacts 'target/*.jar'
      }
    }

    stage('Notify') {
      steps {
        sh 'echo "Simulando envío de mensaje"'
      }
    }

  }
}
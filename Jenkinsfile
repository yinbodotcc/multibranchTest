pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                echo 'Checkout...'
                git url: 'git@github.com:yinbodotcc/simpleTestCanDeleteLater.git'
                //checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'git@github.com:yinbodotcc/simpleTestCanDeleteLater.git']]])
                echo 'Checkout finished'
            }
        }        
        stage('Compile...') {
            steps {
                //build 'petclinic'
                //sh  'mvn clean compile'
                bat 'mvn clean compile' 
                echo ' compile finished '
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                bat 'mvn test'
                echo  ' sh \'mvn test\' '
            }
        }
         stage('Package') {
            steps {
                echo 'Package...'
                bat 'mvn package'
                echo  ' sh \'mvn package\' '
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                echo 'sh \'mvn clean deploy\'  '
            }
        }
    }
    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}

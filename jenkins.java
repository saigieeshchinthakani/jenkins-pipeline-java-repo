class jenkins {

	public static void main(String[] args) {

	System.out.println("Welcome to the world of Jenkins pipeline with Java");

	}

}
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...Java Source code'
                
            }
        }
        stage('Test') {
            steps {
                echo 'Testing java source code'
            }
        }
        stage('Package') {
            steps {
                echo 'Creating java package'
            }
        }
	stage('Deploy') {
		steps {
			echo 'Deploying java package'
		}
	}
    }
}
pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                 //echo 'Fail!'; Exit 1
                  echo 'SUCCESS'
            }
        }
    }
    post {
        always {
            echo 'This code will always run'
        }
        success {
            echo 'This code will only be executed on success'
        }
        failure {
            echo 'This code will only be executed on failure'
        }
        unstable {
            echo 'This code will only be executed on change'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}

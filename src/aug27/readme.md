## Recap 

Environments 

## CI/CD
continous integration 
continous delivery / deployment 

jenkins 
build ? 


## free style project 
# how to create a jenkins pipeline 

Groovy language - JVM based language 

.war - web archieve 
.jar - java archieve 
.exe .dll 

github ---- using maven ---> .jar 
Ec2 -----> java installed 

java -jar abc_1.jar , 
javac 

tomcat  : 8080

## cron job 
scheduled tasks , linux/unix



pipeline {
agent any

    stages {
        stage('Git clone') {
            steps {
                echo 'Cloning from github'
                sleep 5
            }
        }
        stage('Running Test') {
            steps {
                echo 'Test successful'
                sleep 10
            }
        }
        
        stage('Running Sonarqube scan') {
            steps {
                echo 'Sonar qube '
                sleep 10
            }
        }
        
        stage('Deploying to dev') {
            steps {
                echo 'deployed to dev'
                sleep 10
            }
        }
        
        stage('Deploying to staging') {
            steps {
                echo 'deployed to staging'
                sleept 10 
            }
        }
        
        stage('Deploying to prod') {
            steps {
                echo 'deplpyed to prod'
                sleep 20 
            }
        }
    }
}


junit test 

push ----> intergration / dev env



## Maven 


build automation tool 

maven               gradle 

# lombok 

-- mvn clean   - to remove the target folder
-- mvn install - to create jar file



## Jenkins pipleline example 

pipeline {
agent any

    stages {
        stage('CLONE from github ') {
            steps {
                git 'https://github.com/Surinder07/SpringTest.git'
            }
        }
        
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('install') {
            steps {
                sh 'mvn install'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
        
        stage('deploying to dev env') {
            steps {
                sleep 10
                echo 'deployed to dev env'
            }
        }
        
        stage('deploying to staging env') {
            steps {
                sleep 10
                echo 'deployed to staging env'
            }
        }
        stage('deploying to PROD') {
            steps {
                sleep 10
                echo 'deployed to PROD env'
            }
        }
    }
}



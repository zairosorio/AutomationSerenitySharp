import java.text.SimpleDateFormat

def dateFormat = new SimpleDateFormat("yyyyMMddHHmm")
def date = new Date()
def timestamp = dateFormat.format(date).toString()
def EMAILS = "sairosorio@hotmail.com"

pipeline{
	agent any
	stages {
		stage('Get Sources')
		{
		 	steps
		 	{
				checkout([$class: 'GitSCM', branches: [[name: "master"]],
                doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [
                [credentialsId: "1f4d4be1-3c3c-4a92-89cd-03fde9048f83", url:"https://github.com/zairosorio/AutomationSerenitySharp.git"]
                ]])
			}
		}

		stage('Run Tests') {
			steps {
				script {
					try {
						bat ("gradle clean test aggregate  -Denvironment=dev  -Dcontext=chrome -Dwebdriver.driver=chrome -Dinjected.tags=browser:chrome")
						echo 'TESTS IN CHROME EXECUTED SUCCESSFULLY'
						bat ("gradle test aggregate  -Denvironment=dev  -Dcontext=firefox -Dwebdriver.driver=firefox -Dinjected.tags=browser:firefox")
						echo 'TESTS IN FIREFOX EXECUTED SUCCESSFULLY'
						currentBuild.result = 'SUCCESS'
					}
					catch(ex) {
	    				echo 'TESTS FAILED'
	    				currentBuild.result ='UNSTABLE'
					}
				}
			}
		}




	}
}
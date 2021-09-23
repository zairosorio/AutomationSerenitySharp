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
                [credentialsId: "", url:"https://github.com/zairosorio/AutomationSerenitySharp.git"]
                ]])
			}
		}

		stage('Run Tests') {
			steps {
				script {
					try {
						bat ("gradle clean test aggregate  -Dcontext=chrome -Dwebdriver.driver=chrome -Dinjected.tags=browser:chrome")
						echo 'TESTS IN CHROME EXECUTED SUCCESSFULLY'
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
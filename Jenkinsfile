import java.text.SimpleDateFormat

def dateFormat = new SimpleDateFormat("yyyyMMddHHmm")
def date = new Date()
def timestamp = dateFormat.format(date).toString()
def EMAILS = "sairosorio@hotmail.com"

pipeline{
	agent any
		stage('Run Tests') {
			steps {
				script {
					bat 'hello work'
				}
			}
		}




	}
}
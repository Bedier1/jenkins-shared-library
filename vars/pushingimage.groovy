#!/usr/bin/env groovy
def call(String imageName) {

	echo "building docker image "
	 withCredentials([usernamePassword(credentialsId: 'docker-repo', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
                    sh " echo   $PASSWORD  | docker login -u $USERNAME --password-stdin "
                    sh " docker push $imageName "
                   }
}


	 	

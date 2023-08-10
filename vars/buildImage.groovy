#!/usr/bin/env groovy

def buildImage() {
    echo "building the image"
    withCredentials([usernamePassword(credentialsId: "docker-hub-repo", passwordVariable: "PASS", usernameVariable: "USER")]) {
        sh "docker build -t akash712/my-repo:jma-2.0 ."
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push akash712/my-repo:jma-2.0"
    }
}
#!/usr/bin/env groovy

def buildJar() {
    echo "building the application..."
    sh "mvn package"
}
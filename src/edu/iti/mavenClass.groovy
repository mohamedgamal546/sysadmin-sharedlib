package edu.iti;

def build(commandOption){
    sh "mvn ${commandOption}"
}

def test(nanInput){
    sh "mvn test"
}
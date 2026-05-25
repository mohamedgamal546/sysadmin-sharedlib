package edu.iti;

def build(commandOption){
    sh "mvn ${commandOption}"
}

def test(nanInput="nan"){
    sh "mvn test"
}  

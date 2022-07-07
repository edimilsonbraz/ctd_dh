*** Settings ***
Library           SeleniumLibrary
Resource          ./edimilson.resource
Test Teardown     Close Browser

*** Test Case ***
Processo de acessar o bugBank
  Acessar o site
  Fazer login
  
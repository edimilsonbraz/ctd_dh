*** Variables ***
${SITE}           https://bugbank.netlify.app/
${NAVEGADOR}      Chrome
${CAMPO_EMAIL}    __next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.style__ContainerFieldInput-sc-s3e9ea-0.kOeYBn.input__child > input
${EMAL}     edimilson@gmail
${CAMPO_SENHA}    __next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__password > div > input
${SENHA}    123456
${BOTAO_LOGIN}    __next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__buttons > button.style__ContainerButton-sc-1wsixal-0.otUnI.button__child

*** Keywords ***
Acessar o site
  Open Browser      ${SITE}                 ${NAVEGADOR}
  Maximize Browser Window

Fazer login
  Input Text    ${CAMPO_EMAIL}    ${EMAL}
  Input Text    ${CAMPO_SENHA}    ${SENHA}
  Click Element     ${BOTAO_LOGIN}

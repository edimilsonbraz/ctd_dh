*** Variables ***
${SITE}           https://bugbank.netlify.app/
${NAVEGADOR}      Chrome
${CAMPO_EMAIL}    css=.style__ContainerFormLogin-sc-1wbjw6k-0 > .style__ContainerFieldInput-sc-s3e9ea-0 > .input__default
${EMAL}     edimilson@gmail
${CAMPO_SENHA}    css=.login__password:nth-child(2) .input__default
${SENHA}    123456
${BOTAO_LOGIN}    css=.otUnI

*** Keywords ***
Acessar o site
  Open Browser      ${SITE}                 ${NAVEGADOR}
  Maximize Browser Window

Fazer login
  Input Text    ${CAMPO_EMAIL}    ${EMAL}
  Input Text    ${CAMPO_SENHA}    ${SENHA}
  Click Element     ${BOTAO_LOGIN}

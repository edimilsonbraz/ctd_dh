*** Variables ***
${SITE}                         https://www.digitalhouse.com/br
${NAVEGADOR}                    Chrome
${IFRAME_COOKIES}               xpath=/html/body/iframe[2]
${BOTAO_COOKIES}                xpath=/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]
${OUTROS_CURSOS}                css=#__next > div > main > section > div > div.mt-8.flex.justify-center > div > a
${DATA_ANALYTICS}               xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[3]/a
${CHAMADA_DATA_ANALYTICS}       voltado para qualquer pessoa que deseja ampliar suas capacidades analíticas
${DESCRICAO_DATA_ANALYTICS}     pessoas interessadas em business intelligence
${BOTAO_INSCREVER-AGORA}        xpath=//*[@id="__next"]/div/main/section/div/div/div[1]/div/div[2]/div[1]/a
${BOTAO_INSCREVER-SE}           xpath=//*[@id="0"]/div/a
${DATA_SCIENCE}                 xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[4]/a
${CHAMADA_DATA_SCIENSE}         profissionais de diversas áreas que desejam melhorar sua comunicação como engenheiros de Big Data
${DESCRICAO_DATA_SCIENSE}       adquirir habilidades práticas com as ferramentas específicas para fazer análises


*** Keywords ***
Abrir o novo site da Digital House Brasil
  Open Browser    ${SITE}     ${NAVEGADOR}
  Maximize Browser Window

Clicar em "Aceitar Cookies"
  Sleep               2
  Select Frame        ${IFRAME_COOKIES}
  Wait and Click      ${BOTAO_COOKIES}
  Unselect Frame

Clicar em “Ver outros cursos”
  Wait and Click          ${OUTROS_CURSOS}

Selecionar o curso “Data Analytics”
  Wait and Click          ${DATA_ANALYTICS}

Verificar se o texto de chamada do curso está certo
  Page Should Contain     ${CHAMADA_DATA_ANALYTICS}

Verificar se a descrição do curso contém está correta
  Page Should Contain     ${DESCRICAO_DATA_ANALYTICS}

Clicar em "Inscreva-se agora"
  Wait and Click          ${BOTAO_INSCREVER-AGORA}

Clicar em “Inscreva-se”
  Wait and Click          ${BOTAO_INSCREVER-SE}

Validar que o valor do curso é “R$10.315”
  Execute Javascript      window.scroll(0,500)
  Page Should Contain     R$10.315

Selecionar o curso “Data Science”
  Wait and Click          ${DATA_SCIENCE}

Verificar se o texto de chamada do curso de Data Sciense está correto
  Page Should Contain     ${CHAMADA_DATA_SCIENSE}

Verificar se a descrição do curso de Data Sciense está correta
  Page Should Contain     ${DESCRICAO_DATA_SCIENSE}

Validar que o valor do curso é “R$ 11.878”
  Execute Javascript      window.scroll(0,500)
  Page Should Contain     R$11.878


Wait and Click
  [Arguments]                     ${ELEMENTO}
  Wait Until Element is Visible   ${ELEMENTO}
  Click Element                   ${ELEMENTO}


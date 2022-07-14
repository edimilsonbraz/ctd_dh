*** Variables ***
${SITE}                      https://www.hurb.com/br
${NAVEGADOR}                 Chrome
${BOTAO_COOKIES}             xpath=//*[@id="CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"]
${BOTAO_PACOTE}              xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[1]/div/div/button[2]
${CAMPO_PESQUISAR}           css=#destination-input
${TEXTO}                     cancun
${BOTAO_PESQUISAR}           xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[2]/button
${PACOTE_VIAGEM}             xpath=//*[@id="__next"]/div/main/section/div[2]/a[1]
${BOTAO_ESCOLHER_PACOTE}     xpath=//*[@id="__next"]/div/main/div[3]/aside/div/div/div[2]/button
${CHECKED}                   class=h-1ofj5nr
${BOTAO_PROXIMO}             class=h-1yuatql 
${BOTAO_DIARIAS}             class=h-7k3cv9
${QTD_DIARIAS}               5 diárias
${QTD_PESSOAS}               1 pessoa
${BOTAO_BOLETO}              xpath=//*[@id="ui-id-1"]
${CAMPO_EMAIL}               xpath=//*[@id="itxEmail"]
${EMAIL}                     diegorox@gmail.com
${CAMPO_NOME}                xpath=//*[@id="paymentMethods__bill"]/section/div[1]/div[1]/div/input
${NOME}                      Diego Rox Rox
${CAMPO_CPF}                 xpath=//*[@id="paymentMethods__bill"]/section/div[1]/div[2]/div/input
${CPF}                       017.070.650-80    
${CAMPO_TELEFONE}            xpath=//*[@id="paymentMethods__bill"]/section/div[2]/div[1]/div/input
${TELEFONE}                  11 99000-0000 
${TERMOS_ACEITO}             xpath=//*[@id="cancellation-policy"]
${INFOR_CANCELAMENTO}        Cancelamento Grátis
${GERAR_BOLETO}              xpath=//*[@id="buy-button"]/button




*** Keywords ***
Abrir o site do Hurb
  Open Browser       ${SITE}     ${NAVEGADOR}
  Maximize Browser Window

Clicar em "Permitir todos os cookies"
  Sleep               5
  Wait and Click      ${BOTAO_COOKIES}

Selecionar a opção “Pacotes”
  Wait and Click      ${BOTAO_PACOTE}

Buscar por alguma cidade turística e clicar em "Pesquisar"
  Input Text          ${CAMPO_PESQUISAR}      ${TEXTO}
  Wait and Click      ${BOTAO_PESQUISAR}

Selecionar um pacote de viagem
  Wait and Click      ${PACOTE_VIAGEM}
  Switch Window       NEW

Clicar em "Escolher pacote"
  Wait and Click      ${BOTAO_ESCOLHER_PACOTE}

Selecionar as opções do pacote e clicar em "Ir para pagamento"
  Sleep                 5
  Wait and Click        ${CHECKED}  
  Wait and Click        ${BOTAO_PROXIMO} 
  Wait and Click        ${BOTAO_DIARIAS}
  Wait and Click        ${BOTAO_PROXIMO}
  Wait and Click        ${BOTAO_PROXIMO}

Validar as informações da "Configuração" da viagem
  Page Should Contain   ${QTD_DIARIAS}
  Page Should Contain   ${QTD_PESSOAS}

Validar as informações do período da viagem
  Page Should Contain   01
  Page Should Contain   30

Selecionar a opção "Boleto parcelado"
  Wait and Click        ${BOTAO_BOLETO}
  
Preencher os dados de pagamento
  Sleep                    5
  Wait and Input Text      ${CAMPO_EMAIL}       ${EMAIL}
  Wait and Input Text      ${CAMPO_NOME}        ${NOME}
  Wait and Input Text      ${CAMPO_CPF}         ${CPF}
  Wait and Input Text      ${CAMPO_TELEFONE}    ${TELEFONE}

Marcar o checkbox "Li e aceito as condições de termos de uso e política de privacidade"
  Select Checkbox          ${TERMOS_ACEITO}

Validar a informação sobre cancelamento grátis
  Page Should Contain    ${INFOR_CANCELAMENTO}

Finalizar a compra do pacote de viagem
  Wait and Click         ${GERAR_BOLETO}



Wait and Click
  [Arguments]                     ${ELEMENTO}
  Wait Until Element is Visible   ${ELEMENTO}
  Click Element                   ${ELEMENTO}
  
Wait and Input Text
  [Arguments]                     ${CAMPO}  ${TEXTO}
  Wait Until ELement is Visible   ${CAMPO}
  Input Text                      ${CAMPO}  ${TEXTO}
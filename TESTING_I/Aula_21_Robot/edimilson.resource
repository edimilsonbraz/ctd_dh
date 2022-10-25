*** Variables ***
${SITE}                     https://www.saucedemo.com
${NAVEGADOR}                Chrome
${CAMPO_USUARIO}            css=#user-name
${USUARIO}                  standard_user
${USUARIO_INCORRETO}         
${CAMPO_SENHA}              css=#password
${SENHA}                    secret_sauce
${BOTAO_LOGIN}              css=#login-button
${ADICIONAR_CARRINHO}       css=#add-to-cart-sauce-labs-backpack
${CARRINHO}                 css=#shopping_cart_container > a
${BOTAO_CHECKOUT}           css=#checkout
${CAMPO_NOME}               css=#first-name
${NOME}                     Edimilson
${CAMPO_SOBRENOME}          css=#last-name
${SOBRENOME}                Braz
${CAMPO_CEP}                css=#postal-code
${CEP}                      123456
${BOTAO_CONTINUE}           css=#continue
{BOTAO_FINISH}              css=#finish
${MENSAGEM_AGREDECIMENTO}   TKANK YOU FOR YOUR ORDER


*** Keywords ***
Acessar o site
  Open Browser      ${SITE}                 ${NAVEGADOR}
  Maximize Browser Window

Fazer login
  Input Text        ${CAMPO_USUARIO}        ${USUARIO}
  Input Text        ${CAMPO_SENHA}          ${SENHA}
  Click Element     ${BOTAO_LOGIN}

Fazer login com usuário incorreto
  Input Text        ${CAMPO_USUARIO}        ${USUARIO}
  Input Text        ${CAMPO_SENHA}          ${SENHA}
  Click Element     ${BOTAO_LOGIN}

Adicionar um produto ao carrinho
  Wait and Click     ${ADICIONAR_CARRINHO}
  Click Element                     ${ADICIONAR_CARRINHO}

Acessar o carrinho
  Wait and Click     ${ADICIONAR_CARRINHO}
  Click Element      ${CARRINHO}

Clicar em 'Checkout'
  Wait and Click                     ${BOTAO_CHECKOUT}

Preencher informações do usuário
  Wait and Input Text        ${CAMPO_NOME}           ${NOME}
  Wait and Input Text        ${CAMPO_SOBRENOME}      ${SOBRENOME}
  Wait and Input Text        ${CAMPO_CEP}            ${CEP}
  Wait and Click             ${BOTAO_CONTINUE}

Clicar em 'Finish'
  Wait and Click         ${BOTAO_FINISH}
  Page Should Contain    ${MENSAGEM_AGREDECIMENTO}

### Keywords Personalizadas ###

Wait and Click
  [Arguments]                     ${ELEMENTO}
  Wait Until ELement is Visible   ${ELEMENTO}
  Click Element                   ${ELEMENTO}

Wait and Input Text
  [Arguments]                     ${CAMPO}    ${TEXTO}
  Wait Until ELement is Visible   ${CAMPO}
  Input Tet                       ${CAMPO} ${TEXTO}
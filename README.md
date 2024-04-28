# Desafio Conta Banco
Primeiro Projeto de java basico da trilha da DIO em conjunto ao Santander.

Projeto inicial de conteúdos basicos de java do bootcamp Dio e Santander: desenvolvido por:
* [Regislaine Regis](https://github.com/RegislaineRegis)



- [Requisito do projeto](#requisito-do-projeto)

      `Requisitos Obrigatórios`
    - [x] [1. Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos:](#1-#Crie-o-projeto-ContaBanco-que-receberá-dados-via-terminal-contendo-as-características-de-conta-em-banco-conforme-atributos) 

  
          | Atributo     | Tipo    | Exemplo       |
          | ---------    | ------- | -------       |
          | Numero       | Inteiro | 1021          |
          | Agencia      | Texto   | 067-8         |
          | Nome Cliente | Texto   | Mario Andrade |
          | Saldo        | Decimal | 237.48        |
 

    - [x] [2. Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.](#2-#Dentro-do-projeto-crie-a-classe-ContaTerminal-java-para-realizar-toda-a-codificação-do-nosso-programa.)
    - [x] [3. Adicionar configs para salvar em uma fila do rabbit](#3-#Adicionar-configs-para-salvar-em-uma-fila-do-rabbit)
    - [x] [4.Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada.](#4-#Permita-que-os-dados-sejam-inseridos-via-terminal-sendo-que-o-usuário-receberá-a-mensagem-de-qual-informação-será-solicitada)
    - [x] [5. Criar endpoint que fará duas operações: salvar o produto no banco e enviar os dados do produto para a fila do rabbit](#5-#Criar-endpoint-que-fará-duas-operações-salvar-o-produto-no-banco-e-enviar-os-dados-do-produto-para-a-fila-do-rabbit)
    - [x] [6. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem](#6-#Depois-de-todas-as-informações-terem-sido-inseridas-o-sistema-deverá-exibir-a-seguinte-mensagem)

`Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".`
    

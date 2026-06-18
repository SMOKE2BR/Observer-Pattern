# Observer Pattern - Java

Este projeto demonstra o uso do **padrão de projeto Observer** em Java, aplicado a um sistema de conta bancária com diferentes estados.

## 📌 Estrutura

- **Classe principal**
  - `Conta` → representa a conta bancária, herda de `Observable` e dispara notificações quando o estado muda.

- **Classe abstrata**
  - `ContaEstado` → define o contrato para os estados da conta e implementa `Observer`.

- **Estados concretos**
  - `ContaEstadoAtiva` → estado ativo da conta.
  - `ContaEstadoBloqueada` → estado bloqueado.
  - `ContaEstadoEncerrada` → estado encerrado.
  - `ContaEstadoEspecial` → estado especial.

- **Classe de execução**
  - `Main` → configura a conta, adiciona observadores e testa as transições de estado.

## 🚀 Como executar

1. Abra o projeto no **IntelliJ IDEA**.
2. Certifique-se de que os arquivos estão em `src/observer`.
3. Execute a classe `Main`.

## 💻 Saída esperada

Estado inicial: Ativa
Notificação recebida: Bloqueada
Notificação recebida: Especial
Notificação recebida: Encerrada


## 🎯 Objetivo

O padrão **Observer** permite que objetos observadores sejam notificados automaticamente quando o estado de um objeto observável muda.  
Neste exemplo, cada estado da conta é observado e notificado sempre que ocorre uma transição.

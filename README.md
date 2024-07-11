# Conta Java

================

## Descrição do Projeto

Este é um projeto de conta em Java que permite aos usuários criar, ler, atualizar e excluir contas bancárias.

## Funcionalidades

* Criação de contas bancárias com número de conta, titular e saldo inicial
* Depósito e saque de valores em contas bancárias
* Consulta de saldo e histórico de transações de contas bancárias
* Exclusão de contas bancárias

## Tecnologias Utilizadas

* Java 8

## Estrutura do Projeto

* `src/main/java`: pasta contendo os arquivos de código fonte em Java
* `src/main/resources`: pasta contendo os arquivos de recursos do projeto
* `src/test/java`: pasta contendo os arquivos de teste em Java

## Como Executar o Projeto

1. Abra o Eclipse IDE e importe o projeto como um projeto Java existente.
2. Compile o projeto e execute a classe `Main.java` na pasta `src/main/java`.

## Classes do Projeto

### `Conta.java`
```java
public abstract class conta {
    private double saldo;
    private int numeroConta;

    public conta(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(conta destino, double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}

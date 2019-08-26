# Batedor de Ponto

https://ponto.homologacao.ufsc.br/

## Gerar distribuição

Para gerar distribuição da aplicação é necessário utilizar o Ant. Para isso basta executar o comando `ant` na pasta raiz do projeto. Ao executar o Ant serão solicitadas as credenciais para acesso. Essas credenciais serão salvas no arquivo `credenciais.properties` da pasta `distribuicao`. Após a execução do Ant, a pasta `distribuicao` poderá ser renomeada e movida conforme desejado.

## Utilização

Para utilizar basta executar os arquivos `registrar-entrada.jar` e `registrar-saida.jar` conforme a necessidade. É importante que o arquivo `credenciais.properties` seja mantido na mesma pasta.

```
java -jar registrar-entrada.jar
sleep `expr 1 \* 60 \* 60 \* 6`
java -jar registrar-saida.jar
```

# Batedor de Ponto

Ferramenta que permite automatizar o registro de ponto que deve ser realizado através do sistema https://ponto.homologacao.ufsc.br/. Essa ferramenta poderá ser integrada com outras ferramentas ou scripts, possibilitando, assim, que o registro de ponto seja automatizado.

## Gerar distribuição

Para gerar a distribuição da aplicação é necessário utilizar o Ant. Para isso basta executar o comando `ant` na pasta raiz do projeto ou executar o arquivo `build.xml` utilizando o Ant disponível na IDE. Ao executar o Ant serão solicitadas as credenciais para acesso. Essas credenciais serão salvas no arquivo `credenciais.properties` da pasta `distribuicao`. Após a execução do Ant, a pasta `distribuicao` poderá ser renomeada e movida conforme desejado.

## Utilização

Para utilizar basta executar os arquivos `registrar-entrada.jar` e `registrar-saida.jar` conforme a necessidade. É importante que o arquivo `credenciais.properties` e a pasta `driver` sejam mantidos na mesma pasta que os `jar`'s.

```
java -jar registrar-entrada.jar
sleep `expr 1 \* 60 \* 60 \* 6`
java -jar registrar-saida.jar
```

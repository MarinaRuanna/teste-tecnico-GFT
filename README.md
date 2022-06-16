# DESAFIO TECNICO GFT START WOMAN JAVA

- Linguagem Utilizada: Java
- IDE: Intellij


## Desafio 1 - Telefone Encriptado:

Em alguns lugares é comum lembrar um número associando seus dígitos a letras.
Dessa maneira a expressão MY LOVE significa 695683.
Claro que existem alguns problemas, uma vez que alguns números de telefone não formam uma palavra ou frase 
e os dígitos 1 e 0 não estão associados a nenhuma letra.

### Desafio:
Sua tarefa é ler uma expressão e encontrar o número de telefone correspondete baseado na tabela abaixo.
Uma expressão é composta por letras maiúsculas (A-Z), hofes (-) e os números 1 e 0.

|  Letras  |  Número  |
|:--------:|:--------:|
|   ABC    |    2     |
|   DEF    |    3     |
|   GHI    |    4     |
|   JKL    |    5     |
|   MNO    |    6     |
|   PQRS   |    7     |
|   TUV    |    8     |
|   WXYZ   |    9     |

### Entrada:
A entrada consiste em uma expressão. 
Cada expressão possui C caracteres, onde 1 <= C <= 30.

### Saída:
ara cada expressão você deve imprimir o número de telefone correspondente.

### Exemplo:

|      ENTRADA       |       SAIDA        |
|:------------------:|:------------------:|
| 1-HOME-SWEET-HOME  | 1-4663-79338-4663  |
|  MY-MISERABLE-JOB  |  69-647372253-562  |

## Resolução - Desafio 1:

Para esse desafio fiz duas versões, uma usando condicionais com **if else** e outra usando **switch case**

- A expressão digitada pelo usuario é recebida e as letras são convertidas para maiúsculas utilizando a função do objeto String.toUpperCase(),
garantindo assim que toda letra lida será utilizada na conversão independente se a mesma foi fornecida maiuscula ou minuscula.


- A condicional If-Else mais externa verifica se a expressão fornecida pelo usuário tem 30 ou menos caracteres.


- A conversão acontece a partir do bloco **For** que percorre toda a string lendo cada caractere com a função do objeto **String.charAt()**. A função recebe o indice **i** e retorna a variavel **c** que representa um caracter da expressão naquele indice.


- É feita a comparação de cada caracter da expressão que imprime o número correspondente.

[Desafio 1 - Telefone Encriptado(Versão If-Else)](https://github.com/MarinaRuanna/teste-tecnico-GFT/blob/master/src/desafios/questao1_telefone/TelefoneEncriptadoVersaoIfElse.java)

[Desafio 1 - Telefone Encriptado(Vesão Switch-Case)](https://github.com/MarinaRuanna/teste-tecnico-GFT/blob/master/src/desafios/questao1_telefone/TelefoneEncriptadoVersaoSwitch.java)

## Desafio 2 - Tipos de Triangulos:

Determine se um triângulo é equilátero, isóceles ou escaleno:

- Um triângulo **equilátero** tem três lados como mesmo comprimento.
- Um triângulo **isóceles** tem pelo menos dois lados com o mesmo comprimento.
- Um triângulo **escaleno** tem todos os lados com comprimentos diferentes.

Considere também que irá existir um triângulo se, e somente se, os seus lados obedeceram a seguinte regra:
Um de seus lados deve ser maior (módulo) da diferença dos outros dois lados e menor que a soma dos outros dois lados.

### Exemplo:

| ENTRADA |      SAIDA      |
|:-------:|:---------------:|
|  7 7 7  |   Equilátero    |
|  7 7 8  |    Isóceles     |
| 7 8 14  |    Escaleno     |
| 7 8 15  | Não é triangulo |


## Resolução - Desafio 2:

- Recebido os valores dos lados do triangulo primiro é verificado se os valores são positivos.
- O segundo **if** verifica se os valores recebidos podem referenciar um triangulo possivel.
- O Terceiro bloco faz as comparações dos valores dos lados para determinar qual o tipo de triângulo, imprimindo uma String como tipo determinado.

[Desafio 2 - Tipos de Triângulo](https://github.com/MarinaRuanna/teste-tecnico-GFT/blob/master/src/desafios/questao2_triangulos/TiposDeTriangulos.java)


## Desafio 3 - Automóveis:

Faça um programa que contenha a classe automóvel com um atributo combustivel e duas classes que herdam desta **Esportivo** e **Caminhão**
e um programa que recba um **Esportivo** ou um **Caminhão** e retorne o combustível correspondente, a saber: 

- Esportivo utiliza Gasolina;
- Caminhão utiliza Disel;

## Resolução - Desafio 3:

[Desafio 3 - Automóveis](https://github.com/MarinaRuanna/teste-tecnico-GFT/tree/master/src/desafios/questao3_automoveis)

## Desafio 4 - Agenda:

Crie uma agenda que armazena, código de pessoa, número de telefone, idade. 
Sua agenda deve possibilitar:

- (1) - Iserir um contato;
- (2) - Remover um contato;
- (3) - Editar um contato;

## Resolução Desafio 4:

[Desafio 4 - Agenda](https://github.com/MarinaRuanna/teste-tecnico-GFT/tree/master/src/desafios/questao4_agenda)
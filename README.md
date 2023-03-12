# Desafios-OrangeTech
Exercicios Basicos

# Mesasa do sobrinho

Desafio
Seu sobrinho começou a ganhar mesada dos pais. No auge dos seus 8 anos recebendo 50 reais por mês, ele quer saber quanto terá se juntar todo o dinheiro, sem gastar nada, durante alguns meses. E você, como um bom tio com habilidades de programação, vai criar um programa que com as entradas do seu sobrinho vai calcular automaticamente a quantidade de dinheiro que ele terá em X meses.

Entrada
A entrada será o número de meses que o sobrinho polpará o dinheiro.

Saída
A saída deve ser o valor que o sobrinho terá ao final dos meses. (sem as aspas)

Exemplo
Entrada	Saída
     2	 "Voce tera 100 reais"
     4	 "Voce tera 200 reais"
    10	 "Voce tera 500 reais"
    
# Downloads Pacotes

Desafio
Você foi contratado para criar um gerenciador de pacotes. Porém, o que restou para você fazer foi o contador de porcentagem de download dos pacotes. Mas como o espaço para essa informação ficou pequeno, a empresa optou por fazer uma escala de 10 – 1. Então a escala será 1 = 10%, 2 = 20%, 3 = 30% e etc.
Para cada 10% de download, o programa deve printar, em sequência e sem espaços, uma barra “/”.

Entrada
A entrada será um número que representará a porcentagem

Saída
A saída serão as barras sem espaços entre elas.

Exemplo
Entrada	Saída
    1	           /
    3	          ///
    7	        ///////
    
# Leitura da Gertudres

Desafio
Sua tia Gertrudes é uma leitora assídua. E ela gostaria de ter um aplicativo que dissesse para ela, de acordo com o número de páginas de um livro, quanto tempo ela levaria para ler lendo apenas 3 páginas por dia. Como você está aprendendo Java, você se disponibilizou para ajudá-la com esse desenvolvimento.

Entrada
A entrada será o número de páginas de um determinado livro

Saída
A saída deverá ser quanto tempo ela vai levar para ler esse livro

Exemplo
Entrada	Saída
   30	    "10 dias"   
   15	      "5 dias"
   90	    "30 dias"

# Lojinha de doces

Desafio
Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola. Para aumentar as vendas o dono resolveu colocar uma máquina onde os clientes, principalmente as crianças que estão muito acostumadas com a tecnologia, poderiam colocar suas moedas e receber dois doces aleatórios. Cada 1 real irá render 2 doces aleatórios.

Entrada
A entrada será a quantidade de dinheiro que cada cliente, um por vez, possui.

Saída
A saída deverá ser a quantidade de doces que cada cliente conseguiu obter. (sem as aspas)

Exemplo
Entrada	Saída
   10	 "O cliente obteve 20 doces"
   20	 "O cliente obteve 40 doces"
   40	 "O cliente obteve 80 doces"

# Industria de multa

Desafio
A prefeitura de uma cidade A instalou uma câmera para verificar quem estava acima da velocidade permitida na rodovia da entrada da cidade. Porém, ela é uma cidade extremamente movimentada e a prefeitura não deu conta de enviar as multas necessárias para quem ultrapassasse a velocidade permitida de 60km/h.

O seu papel será o de criar um programa que verifique os dados recebidos da câmera e envie uma mensagem dizendo se o motorista será multado ou não.

Entrada
A entrada vai ser a velocidade do motorista.

Saída
A saída será uma mensagem no console dizendo se o motorista foi multado ou não. (sem as aspas)

Exemplo
Entrada	Saída
   60	 "Nao foi multado"
   68	    "Foi multado"
  100	    "Foi multado"

# Intermediários

Desafio
Sua irmã está com o computador muito lento e pediu para você formata-lo. Mas ela gostaria muito de que todas as músicas dela fossem salvas e não deletadas com o resto dos arquivos durante a formatação. Todas as músicas estão no formato .mp3
Crie um programa que cada arquivo com esse formato não seja deletado.

Entrada
A entrada será uma String com o nome da música e seu formato.

Saída
A saída deve ser se o arquivo será salvo ou não.

Exemplo
Entrada	Saída
   "minhasamigas.png"  	      "Deletar"
   "Californication.mp3"	      "Salvar"
   "Zeca Pagodinho - Algum Completo.rar"
   
# Pontos na Carteira
   
A prefeitura da cidade B, inspirada por uma cidade A, decidiu implementar um sistema de câmeras que iria verificar se os carros estão acima de 80km/h. Porém, eles queriam também anotar a placa dos carros no banco de dados para que, a partir de 3 multas, os motoristas perdessem pontos diretamente na carteira de habilitação. Para isso, contrataram você para realizar esse programa, logo que você fez um trabalho tão bom para a cidade A.
Lembrando que toda vez que um carro é pego pela câmera e está acima da velocidade permitida automaticamente já é contabilizado uma multa para ele.
Entrada
A entrada será a velocidade que o veículo está e quantas multas ele já recebeu. Se ele estiver acima da velocidade, deve ser somado mais uma multa.
Saida
A saída deverá ser quantas multas o motorista já tem e se ele irá receber pontuação na carteira de habilitação.
Exemplo
Entrada	Saída
80
1	"1 multas. Nao levou pontos na carteira"
85
1	"2 multas. Nao levou pontos na carteira"
95
2	"3 multas. Levou pontos na carteira"
  
# Desafio - Imoveis Disponiveis
O seu amigo quer verificar quais os imóveis estão disponíveis em uma certa corretora na região onde ele mora. A corretora disponibilizou uma API para ele, mas como ele não entende nada de programação, pediu a sua ajuda. Para deixar tudo bonitinho, você resolveu criar um aplicativo para seu querido amigo, mas quando foi olhar a API retornava os dados de uma forma esquisita, separado por barras. Ajude seu amigo deixando a informação mais amigável possível.

Entrada
A entrada será a classificação do imóvel, o valor do aluguel dele e se ele está disponível no momento.

Saída
A saída deverá ser as informações da entrada, porém de uma forma mais amigável. (sem as aspas)

Exemplo
Entrada	Saída
  Casa/1900/Disponivel	 "Imovel: Casa R$1900 Disponivel"
  Apartamento/850/Indisponivel 	 "Imovel: Apartamento R$850 Indisponivel"
  
# Desafio - Mc Monalds
Você levou sua namorada na incrível rede de lanchonetes Dc Monalds e ficou maravilhado como aquele lanche era gostoso. Porém, ficou horrorizado como algumas coisas no aplicativo do cardápio estavam erradas. Então, você se ofereceu para ajudá-los com seus conhecimentos de programação. Ao conversar com o gerente, ele te explicou que a vontade da lanchonete era criar um menu com os nomes dos ingredientes formando o lanche, como no exemplo abaixo:

Pao
Presunto
Carne
Pao

Ajude o restaurante a programar isso.

Entrada
A entrada serão os ingredientes que compõem o lanche.

Saída
A saída deverá ser o lanche montado com as palavras que definem os ingredientes.

Exemplo
Entrada	                              Saída
Pao;Presunto;Carne;Pao     	          Pao
                                      Presunto
                                      Carne
                                      Pao

Pao;Picles;Tomate;Pao 	              Pao
                                      Picles
                                      Tomate
                                      Pao

Pao;Tomate;Carne;Pao	              Pao
                                      Tomate
                                      Carne
                                      Pao

# Desafio Camarote
No show da famosa banda Blue Cold Ice Cubes o vocalista, Antônio Queda, escolheu todas as pessoas que estavam na posição impar da fila para entrarem no camarote. Ele fez isso em diversos shows e as pessoas foram a loucura para competirem por essas posições. Você resolveu criar um programa para saber, de acordo com o número de pessoas na fila, quantas entrariam no camarote.

Entrada
A entrada será o tamanho da fila que aguardava para ver o show.

Saída
A saída deve ser o número de pessoas que foram colocadas no camarote. (sem as aspas)

Exemplo
Entrada	Saída
   100	"50 pessoas no camarote"
    40	"20 pessoas no camarote"
    25	"13 pessoas no camarote"

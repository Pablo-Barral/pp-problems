<h1>Flyweight</h1>
<h3>Desenvolvido em sala por: <h5>Maurício Reis, Pablo Barral</h5></h3>
<p>Neste exemplo, é simulado um momento em um jogo de estratégia onde muitos personagens podem estar no tabuleiro em um mesmo momento.
 No exemplo, são utilizados apenas 5 jogadores, porém entende-se que a mesma lógica pode ser aplicada para um numero teoricamente
infinito.</p>
<p>Neste sentido, o padrão flyweight permite a instanciação de diversos personagens de um mesmo tipo a partir de um memsmo objeto, 
ou seja, economiza em recursos diminuindo o "peso" do jogo.</p>
<p>Enquanto os detalhes individuais de cada exercito são salvos de forma independente, as informações das unidades que o compoem (esquadrão) são
armazenadas em uma instância única. Isto é, posição, saúde e status de batalha são guardados individualmente,
 e o tipo das unidades do esquadrão (aqui lido como classe Suporte, Tanque, etc), textura (a armadura: leve, pesada, etc) e o modelo do personagem (no exemplo, a "raça": humano, elfo, etc)
ficam salvos em único objeto daquele tipo de unidade.</p>
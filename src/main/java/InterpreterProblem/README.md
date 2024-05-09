<h1>Interpreter</h1>
<h3>Desenvolvido em sala por: <h5>Maurício Reis, Pablo Barral</h5></h3>
<p>Neste exemplo, há um interpretador que interpreta uma expressão matemática
inserida em <i>string</i> e calcula seu valor numérico.</p>
<p>Há suporte para operações de soma, subtração, divisão, multiplicação e uso
de parenteses para determinar a ordem de operações.</p>
<p>Uma entrada de texto válida requer ao mínimo 2 núemros  e 1 operador válido ( + - / ou *)
e deve separar os caracteres por um espaço simples, ou um núemro apenas (retornará o próprio número).</p>
<p>Exemplos de entradas válidas:</p>
<ul>
<li>7</li>
<li>1 + 1</li>
<li>11 * 3</li>
<li>2 + 4 / 3 - 1</li>
<li>1 + ( 5 - 3 )</li>
<li>7 + ( 1 + 4 * 5 ) - ( 2 + 1 )</li>
</ul>
<p>Exemplos de entradas inválidas:</p>
<ul>
<li>1+ 1</li>
<li>11*3</li>
<li>1 + ( * 5 - 3 )</li>
<li>7 +( 1 + 4 * 5 ) - ( (2 + 1 )</li>
</ul>
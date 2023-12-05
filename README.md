# Projeto Sistema de Estoque

# Badges
![Badge Concluído](http://img.shields.io/static/v1?label=STATUS&message=CONCLUÍDO&color=GREEN&style=for-the-badge)

# Descrição do Projeto
<p> Projeto universitário para a disciplina de Programação Orientada a Objetos da Unit-PE. </p>

# :white_check_mark: Tecnologia Utilizada
<ul>
  <li>Java</li>
</ul>

# :hammer: Funcionalidades e Demonstração da Aplicação
<h3> Package: Dados </h3>
<p>
Neste pacote teremos a classe Produto, que encapsula as propriedades e comportamentos relacionados a produtos. A classe é declarada como pública e possui os atributos privados código, quantidade, preço, tipo de produto, descrição e fabricante. Além disso também possui um array de objetos produto chamado de lista. Há um construtor padrão vazio e um construtor que aceita argumentos para inicializar os atributos da classe, além dos métodos getters e setters. O método 'getTipoProduto'converte o código do tipo de produto para uma descrição legível (por exemplo, "1" para "Alimentício"). O método 'ToString'retorna uma string formatada representando os detalhes do produto.E o método 'info' imprime informações formatadas do produto no console.
</p>

<h3> Package: Interface_usuario </h3>
<p>
Neste pacote temos a classe pública Execucao que gerencia as interações do usuário e chama métodos no objeto 'SistemaDeEstoque' com base nas escolhas do usuário. Importa as classes necessárias do pacote java.util e Repositorio.SistemaDeEstoque. O método 'Main' se encontra nesta classe, justamente por ser o método chamado quando o programa é executado. Foram criadas as instâncias da classe SistemaDeEstoque e da classe Scanner para receber entrada do usuário. Para o menu de opções foi implementado um loop do-while que continua executando até que o usuário escolha encerrar o programa (comando 0), também há um switch-case que trata as opções do menu com base no valor da variável comando.
</p>

<h3> Package: Negocios </h3>
<p>
Neste pacote temos a Interface IProduto, que define um contrato que qualquer classe que a implemente deve seguir, declara três métodos públicos: adicionar, remover e pesquisar. Esses métodos não têm implementação na interface, apenas a assinatura (declaração).
</p>

<h3> Package: Repositorio </h3>
<p>
Neste pacote temos a classe pública SistemadeEstoque que mantém uma lista de produtos e implementa a interface IProduto para realizar operações específicas de produtos. São importadas as classes necessárias dos pacotes java.util, Dados.IProduto e Dados.Produto. Os atributos dessa classe são um ArrayList chamado lista que armazena objetos da classe Produto e um inteiro chamado total. O método 'adicionar' solicita informações do usuário para criar um novo objeto Produto e adiciona esse objeto à lista. O método 'remover' implementa o método da interface IProduto para remover um produto da lista com base no código informado pelo usuário. O método 'pesquisar' implementa o método da interface IProduto para pesquisar um produto na lista com base no código informado pelo usuário, ele também oferece a opção de alterar a quantidade. Teremos os métodos para geração de relatórios, o  método 'relatorioGeral' produz um relatório geral exibindo informações de todos os produtos, já os métodos 'produtoAlimenticio', 'produtoBebida', 'produtoLimpeza', 'produtoHigiene' e 'produtoDiversos' produzem relatórios específicos para cada categoria de produto.
</p>

# Pessoas Desenvolvedoras do Projeto
| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/89558668?v=4" width=115><br><sub>Ana Beatriz Lira</sub>](https://github.com/anabsl) | [<img loading="lazy" src="https://avatars.githubusercontent.com/u/150970636?v=4" width=115><br><sub>Lucineia Lima</sub>](https://github.com/LucineiaLima) | [<img loading="lazy" src="https://avatars.githubusercontent.com/u/138301226?v=4" width=115><br><sub>Luiz Henrique</sub>](https://github.com/Luizh92) | [<img loading="lazy" src="https://avatars.githubusercontent.com/u/130245094?v=4" width=115><br><sub>Rayane Kelly</sub>](https://github.com/Rayane-Souza) | [<img loading="lazy" src="https://avatars.githubusercontent.com/u/146589409?v=4" width=115><br><sub>Rogério Melo</sub>](https://github.com/Rogerio-07) 
| :---: | :---: | :---: | :---: | :---: |

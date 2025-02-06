# Battle Simulator
Este projeto é uma simulação em Java de batalhas entre heróis e monstros. Os jogadores podem criar um herói, escolher seu tipo e enfrentar monstros em uma batalha simulada.
## 🚀 Funcionalidade Principal
- Criação de heróis personalizados com nomes e tipos.
- Detalhes exibidos do personagem (nome, tipo e possíveis atributos).
- Execução de batalhas automatizadas entre herói e monstro.
- Estrutura que pode ser estendida com novos tipos de heróis e monstros.

## 🛠️ Tecnologias Utilizadas
- **Java 21**: Linguagem principal utilizada no desenvolvimento.
- **Programação Orientada a Objetos**: Uso de classes como `Hero`, `Monster`, `Battle` para modularidade e reusabilidade.
- **Entrada do Usuário**: Interação utilizando a classe `Scanner`.

## 📂 Estrutura do Projeto
O projeto segue uma estrutura básica organizada em pacotes:
``` 
src/
├── Test/
│   └── BattleTest.java      # Classe principal para execução do programa.
├── Domain/
│   ├── Hero.java            # Representação do herói.
│   ├── Monster.java         # Representação do monstro inimigo.
│   ├── Battle.java          # Lógica para gerenciar as batalhas.
│   └── PrintHeroInfo.java   # Exibição das informações do herói.
```
> **Nota**: O pacote `Domain` contém as classes principais que implementam a lógica de batalha, enquanto `Test` contém o código para execução e teste do programa.
> 

## ▶️ Como Executar
1. Certifique-se de ter o Java 21 (ou versão superior) instalado no seu sistema.
2. Clone o repositório para sua máquina local:
``` bash
   git clone https://github.com/seu_usuario/nome_projeto.git
```
1. Navegue até o diretório do projeto.
2. Compile os arquivos `.java`:
``` bash
   javac src/**/*.java
```
1. Execute a classe principal (`BattleTest`):
``` bash
   java Test.BattleTest
```
1. Siga as instruções no console para criar seu herói e iniciar a batalha.

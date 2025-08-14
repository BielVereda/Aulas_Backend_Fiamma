# 🚀 Guia Prático do Git

> 💡 **O que é o Git?**  
> O **Git** é um sistema de **controle de versão** que permite registrar, navegar e reverter mudanças em um projeto ao longo do tempo.  
> Ele também possibilita manter uma cópia do seu projeto **na nuvem** usando serviços como **GitHub** (mais popular), **GitLab** ou **Bitbucket**.

---

## 🛠️ Funcionalidades principais
- 📜 **Histórico**: volte para versões antigas do projeto.  
- 🛡 **Segurança**: recupere arquivos corrompidos.  
- 📈 **Organização**: acompanhe a evolução como desenvolvedor.  

---

## 💻 Git Bash
Após instalar o Git, abra o **Git Bash** e execute:

```bash
# Inicia o Git na pasta atual
git init

# Configura seu usuário e e-mail (GitHub)
git config --global user.name "SeuNomeDeUsuario"
git config --global user.email "seuemail@exemplo.com"
🆕 Criando um repositório do zero
Vá no GitHub → Repositórios → Novo.

Dê um nome e descrição (não crie o README agora).

No PC, crie uma pasta e abra o terminal nela.

Conecte a pasta local ao GitHub:

bash
Copiar
Editar
git remote add origin https://github.com/usuario/repositorio.git
Renomeie a branch principal:

bash
Copiar
Editar
git branch -M main
Envie alterações:

bash
Copiar
Editar
git add .                      # Adiciona todos os arquivos
git commit -m "mensagem"        # Cria um commit
git push origin main            # Envia para o GitHub
📥 Clonando um repositório existente
bash
Copiar
Editar
git clone https://github.com/usuario/repositorio.git
Após clonar, edite e envie commits como mostrado acima.

📝 Commits Semânticos
Commits bem descritos ajudam a entender a evolução do projeto.

Tipo	Descrição
feat:	Nova funcionalidade
fix:	Correção de bugs
docs:	Alterações na documentação
assets:	Arquivos de imagem, fontes, etc
style:	Mudança visual (CSS, variáveis)
refactor:	Refatoração sem novas funções
chore:	Mudanças estruturais sem impacto no código
test:	Criação ou modificação de testes

🔀 Merge Commit
Criado ao unir duas branches (git merge).

Preserva o histórico e mostra claramente onde houve junção.

🌿 Branches
Uma branch é uma linha de desenvolvimento independente.
Quando criar uma branch?

✨ Nova funcionalidade (feat/...)

🐞 Correção de bug (fix/...)

📚 Atualização de docs ou configs (docs/... ou chore/...)

🛠 Refatoração (refactor/...)

📌 Comandos úteis do Git
bash
Copiar
Editar
git init                       # Inicializa o Git
git add arquivo.txt            # Adiciona arquivo específico
git add .                      # Adiciona todos os arquivos
git commit -m "tipo: descrição" # Cria commit
git push origin branch          # Envia commits para o repositório remoto
git pull                        # Atualiza para a versão mais recente
git checkout nomeBranch         # Troca de branch
git checkout -b novaBranch      # Cria e troca para nova branch
git branch                      # Lista branches
git branch -M novoNome          # Renomeia branch
git status                      # Mostra status dos arquivos
✅ Dicas Finais
Use mensagens de commit claras 🗒 para facilitar revisões.

Crie branches separadas para cada funcionalidade ou correção.

Sempre puxe (git pull) antes de começar para evitar conflitos.
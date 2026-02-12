# Sistema de controle de versão com GIT

## Configuração inicial para uso do git

- configuração inicial de nome de usuário e endereço de e-mail no git

- - É obrigatório para usar o git a configuração inicial de nome e e-mail, e também é necessário na hora de subir alterações para o GitHub. Para a configuração de nome de usuário e endereço de e-mail no git, execute os seguintes comandos  no terminal: 

```bash
git config --global user.name "seu usuário"
git config --global user.email "seu@email.com"
```

- Criando Personal Access Token (PAT) no GitHub

- - Um personal Acces Token (PAT) é um código gerado pelo github, que é usado para autenticar o usuário na hora de subir algo para o repositório remoto. É essencial que você NÃO compartilhe ele com NINGUÉM, e é preferível que você salve ele em algum lugar. Para criar um Personal Acess Token (PAT) pelo github, siga os seguintes passos: 

1. Clique no seu perfil (canto superior direito da tela)
2. Clique em 'Configurações' 
3. Clique em 'Opções de Desenvolvedor'
4. Clique em 'Personal Acces Tokens'
5. Clique em 'Tokens (classic)' ou 'Fine-grained tokens'
6. Dê um nome para o seu token e uma descrição (caso seja possível)
7. Defina as permissões desse token (classic) ou acesso a repositório (fine grained) 

- Salvar em cache as credenciais do PAT

- - Salvar as credencias em cache é muito conveniente para que não seja necessário copiar e colar as credencias sempre que for realizar um push. Para salvar sua credencial em cache por uma hora, execute no seu terminal o seguinte comando: 

```bash
# esse comando salva as credenciais por uma hora.
# modifique o valor de timeout para aumentar ou diminuir o tempo
git config −−global credential.helper 'cache −−timeout=3600'
```
---
## Qual a diferença entre git merge e git rebase?

A diferença principal entre o git merge e o git rebase é que o merge preserva o histórico original, e cria um commit novo de merge, que une os dois ramos. A principal vantagem é que ele preserva o histórico de commits original de ambas as branches, e é uma opção segura. A desvantagem é que ele pode aumentar a complexidade do histórico de commits, por gerar uma mensagem de commit de merge.

Enquanto isso, o git rebase move todos os commits de uma branch para a ponta da outra branch 

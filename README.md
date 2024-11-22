
# Hash de Senhas em Java

Este é um projeto simples em Java para demonstrar como criar um hash seguro de senhas e verificar sua validade. Ele utiliza o algoritmo **SHA-256** para criptografia e armazena a senha do usuário em um formato seguro.

---

## 🚀 Funcionalidades

- Receber as informações do usuário (nome, email e senha).
- Gerar um hash seguro da senha usando o algoritmo **SHA-256**.
- Verificar a validade da senha fornecida pelo usuário.
- Garantir que a senha armazenada nunca é exposta em texto plano.

---

## 🛠️ Estrutura do Projeto

O projeto é composto por três classes principais:

### **1. `App`**
- Classe principal do programa.
- Realiza a interação com o usuário via terminal.
- Cria um objeto do tipo `Usuario` e realiza a verificação da senha.

### **2. `HashSenha`**
- Responsável por gerar o hash da senha.
- Usa o algoritmo **SHA-256** e converte o hash para o formato **Base64**.
- Verifica se uma senha corresponde ao hash armazenado.

### **3. `Usuario`**
- Representa o modelo de usuário.
- Armazena os dados do usuário (nome, email e senha hasheada).
- Realiza a validação da senha fornecida pelo usuário.

---

## 🧩 Tecnologias Utilizadas

- Linguagem: **Java**
- Algoritmo de hash: **SHA-256**
- Biblioteca de utilidades: **Base64** (para codificação de saída do hash)

---

## 📝 Como Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/hash-senhas-java.git
   cd hash-senhas-java
   ```

2. **Compile o projeto**:
   ```bash
   javac App.java Usuario.java HashSenha.java
   ```

3. **Execute o programa**:
   ```bash
   java App
   ```

4. **Interaja com o programa**:
   - Digite o nome, email e senha do usuário.
   - Verifique se a senha está correta digitando-a novamente.

---

## 🖥️ Exemplo de Uso

Entrada do usuário:
```
Digite o nome do usuário:
João Silva
Digite o email do usuário:
joao.silva@email.com
Digite a senha do usuário:
minhaSenhaSegura123
hash da senha: H+X+qhGhjbAvUuOl3dJ3ZFPcChaiRckLfsAvnHfE60w=
Digite a senha para verificar:
minhaSenhaSegura123
```

Saída:
```
Senha correta
```

---

## 📚 Próximos Passos

- Adicionar suporte a um **salt** para aumentar a segurança.
- Implementar testes automatizados para validar o comportamento do programa.
- Criar uma interface gráfica para interação com o usuário.

---

## 🤝 Contribuição

Sinta-se à vontade para abrir issues ou enviar pull requests para melhorias no projeto.

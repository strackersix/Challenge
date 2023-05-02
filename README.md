## Automação de testes funcionais "end2end", também conhecidos como testes:
![image](https://user-images.githubusercontent.com/56303911/235588285-93e04e90-4f1d-4cb3-a206-62c73f180b46.png)

#### :arrow_forward: [Click aqui](https://www.loom.com/share/00cea995b136492baeea2ac8a55b4651) para assistir o projeto em execução, ou:

### 1- Baixe e instale os seguintes programas: 
 * [Java JDK 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html)
 * [IntelliJ Community Edition](https://www.jetbrains.com/idea/download/#section=windows)
 
### 2- Configure as variáveis de ambiente JAVA_HOME e MAVEN_HOME conforme print abaixo: 
![variáveis de ambiente](https://user-images.githubusercontent.com/56303911/235577937-ed95d2a3-6ab3-41d6-8dfb-c0b42cca0d68.png)
### 3- Selecione a branch Master e clone o projeto via execução do comando: "git clone git@github.com:strackersix/Challenge.git" dentro do terminal do windows ou git bash, ou clique no botão download.
![image](https://user-images.githubusercontent.com/56303911/235578916-b72cb7de-ee9b-41fd-86a6-6bb3b1d79d44.png)

### 4- Cole o projeto baixado dentro da pasta padrão do IntelliJ: "IdeaProject" e importe o mesmo:
![image](https://user-images.githubusercontent.com/56303911/235579308-b38233c2-b885-4650-b27a-db652a498ba5.png)

### 5- Após importação abra o terminal desejado dentro do diretório do projeto e execute o seguinte comando para execução dos testes: mvn clean -Dtest=TestLupa test 
![image](https://user-images.githubusercontent.com/56303911/235579915-fcd88ea9-661c-4a02-953f-7afcb16b0eda.png)

### 6- Após execução dos testes execute o seguinte comando para geração do Allure Report: mvn allure:serve 
![image](https://user-images.githubusercontent.com/56303911/235580177-a558f219-6d6f-45f5-b413-029130572637.png)

### Allure Report gerado no navegador padrão do sistema operacional: 
![image](https://user-images.githubusercontent.com/56303911/235580397-51bb22e1-a2bc-47f3-96de-a23357bde234.png)

![image](https://user-images.githubusercontent.com/56303911/235580651-90761bb7-fc31-44f8-97b6-36d900932ad1.png)
![image](https://user-images.githubusercontent.com/56303911/235580907-3faa1617-f2b7-4e1e-9387-c22966826494.png)

---
:warning::rotating_light: Atenção!!! :rotating_light::warning:
#### Caso o projeto apresente erro de divergência entre a versão do navegador "Google Chrome", e o "chromedriver.exe", será necessário igualar as versões.
[Download chromedriver.exe](https://chromedriver.chromium.org/downloads)
![image](https://user-images.githubusercontent.com/56303911/235582840-9af0a7bf-ba76-42c4-93fd-13889dfa9400.png)














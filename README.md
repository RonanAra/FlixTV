# 🎬 FlixTV

FlixTV é um aplicativo para Android TV que exibe informações sobre filmes populares, tendências e detalhes completos dos filmes. O projeto utiliza a API do The Movie Database (TMDb) para obter os dados.

## 📌 Funcionalidades
- 📺 Catálogo de filmes e séries
- 🔍 Busca por título *(em desenvolvimento)*
- ℹ️ Detalhes de cada filme ou série *(em desenvolvimento)*

## 🚀 Tecnologias Utilizadas
- **Android** (Leanback Library, Kotlin)
- **Arquitetura**: MVVM + Clean Architecture
- **Networking**: Retrofit e OkHttp para chamadas de API
- **Injeção de Dependência**: Dagger Hilt
- **Concorrência**: Coroutines para programação assíncrona

## 📽️ Demonstração
![Demonstração]([Screen_recording_20250219_114816.webm](app%2Fsrc%2Fmain%2Fres%2Fvideos%2FScreen_recording_20250219_114816.webm))

## ⚙️ Como Rodar o Projeto
Para rodar o projeto, siga os passos abaixo:

1. Clone este repositório e abra no Android Studio:

   ```sh
   git clone https://github.com/RonanAra/FlixTV.git
   ```

2. Adicione a chave da API no arquivo `build.gradle` dentro da seção `defaultConfig`:

   ```gradle
   buildConfigField("String", "API_KEY", '"SUA_CHAVE_AQUI"')
   ```

3. Execute o projeto em um emulador ou dispositivo físico.

## 📜 Licença
Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👨‍💻 Autor
Desenvolvido por [Ronan Araújo](https://github.com/RonanAra).  
Se gostou do projeto, deixe uma estrela ⭐!

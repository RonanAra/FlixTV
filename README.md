<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>FlixTV - README</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
            padding: 20px;
            background-color: #f4f4f4;
        }
        h1, h2 {
            color: #333;
        }
        code {
            background-color: #eee;
            padding: 2px 5px;
            border-radius: 4px;
        }
        pre {
            background: #333;
            color: #fff;
            padding: 10px;
            border-radius: 5px;
        }
        .container {
            max-width: 800px;
            margin: auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>🎬 FlixTV</h1>
        <p><strong>FlixTV</strong> é um aplicativo Android que exibe informações sobre filmes populares, tendências e detalhes completos dos filmes. O projeto utiliza a API do The Movie Database (TMDb) para obter os dados.</p>

        <h2>📌 Funcionalidades</h2>
        <ul>
            <li>Catálogo de filmes e séries</li>
            <li>Busca por título (em desenvolvimento)</li>
            <li>Detalhes de cada filme ou série (em desenvolvimento)</li>
        </ul>

        <h2>🚀 Tecnologias Utilizadas</h2>
        <ul>
            <li>Android (Leanback Library, Kotlin)</li>
            <li>Arquitetura MVVM + Clean Architecture</li>
            <li>Retrofit e OkHttp para chamadas de API</li>
            <li>Dagger Hilt para injeção de dependência</li>
            <li>Coroutines para programação assíncrona</li>
        </ul>

        <h2>📽️ Demonstração</h2>
        <video width="100%" controls>
            <source src="[Screen_recording_20250219_114816.webm](..%2F..%2FVideos%2FCaptures%2FScreen_recording_20250219_114816.webm)" type="video/mp4">
        </video>

        <h2>⚙️ Como Rodar o Projeto</h2>
        <p>Clone este repositório e abra no Android Studio:</p>
        <pre><code>git clone https://github.com/RonanAra/FlixTV.git</code></pre>
        <p>Adicione a chave da API no arquivo <code>build.gradle</code> dentro da seção <code>defaultConfig</code>:</p>
        <pre><code>buildConfigField("String", "TMDB_API_KEY", '"SUA_CHAVE_AQUI"')</code></pre>
        <p>Em seguida, execute o projeto em um emulador ou dispositivo físico.</p>

        <h2>📜 Licença</h2>
        <p>Este projeto está sob a licença MIT. Veja o arquivo <code>LICENSE</code> para mais detalhes.</p>

        <h2>👨‍💻 Autor</h2>
        <p>Desenvolvido por <a href="https://github.com/RonanAra">Ronan Araújo</a>. Se gostou do projeto, deixe uma estrela ⭐!</p>
    </div>
</body>
</html>
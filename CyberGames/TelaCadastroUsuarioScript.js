const cadastro = document.querySelector("form"); 

const InputNome = document.querySelector(".input.nome");
const InputEmail = document.querySelector(".input.email");
const InputDataNascimento = document.querySelector(".input.data");
const InputSenha = document.querySelector(".input.senha");

function cadastrar (){

    fetch("http://localhost:8080/usuarios",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            
            nome: InputNome.value,
            email: InputEmail.value,
            data: InputDataNascimento.value,
            senha: InputSenha.value
        })
    })
    .then (function (res) {console.log(res) })
    .catch (function (res) {console.log(res) })

};

function LimparCampos(){

    InputNome.value = "";
    InputEmail.value = "";
    InputDataNascimento.value = "";
    InputSenha.value = "";

}


cadastro.addEventListener('submit', function (event) {

    event.preventDefault();
    
    LimparCampos();
    cadastrar();
}); 
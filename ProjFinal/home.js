var templateBarra = `<img src="**FOTO**" width="35px"> Bem vindo, <b> **NOME**`;

var templateTt = `
                <div class="row rowdtp">
                    <div class="col-md-4 comborda">
                         **NOME** 
                    </div>
                    <div class="col-md-4 comborda">
                         **VOLUME** <br>
                    </div>
                </div>`;
function carregaTopTen(){
    fetch("http://localhost:8080/agentefinanceiro")
        .then(res => res.json())
        .then(res => preencheTopTen(res));
}

function preencheTopTen(resJson){
    console.log(resJson);
    var contStr ="";
    for (i=0; i<resJson.length; i++){
        var tt = resJson[i];
        var novaLinha = templateTt.replace("**NOME**",tt.nome)
                                   .replace("**VOLUME**",tt.volume);
        contStr = contStr + novaLinha;
    }
    document.getElementById("conteudo").innerHTML = contStr;
}



function dropitem(str){
    //var res = document.getElementById("dropmenu").value;
    var select = document.getElementById("agentes");
    var option = select.options[select.selectedIndex];
    alert(option.id);
}

function verificaUsuario(){
    var userLogado = localStorage.getItem("userDash");
    if (!userLogado){
        window.location="index.html";
    }
    else{
        var user = JSON.parse(userLogado);
        document.getElementById("barraUser").innerHTML = templateBarra
                                                    .replace("**FOTO**",user.linkFoto)
                                                    .replace("**NOME**", user.nome);
    }
}
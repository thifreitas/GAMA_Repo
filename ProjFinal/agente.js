

var templateAg =  `
                <div class="row rowag">
                    
                    <div class="col-md-12 comborda">
                        **PARCEIRO** <br>
                    </div>

                    <div class="col-md-6 comborda">
                        Volume
                    </div>
                    <div class="col-md-6 comborda">
                        R$ **VOLUME** <br>
                    </div>
                    
                    <div class="col-md-6 comborda">
                        Sucesso
                    </div>
                    <div class="col-md-6 comborda">
                        **OK** <br>
                    </div>

                    <div class="col-md-6 comborda">
                        Falhas
                    </div>
                    <div class="col-md-6 comborda">
                        **FALHAS** <br>
                    </div>

                    <div class="col-md-6 comborda">
                        Falhas
                    </div>
                    <div class="col-md-6 comborda">
                        **FRAUDES** <br>
                    </div>
                </div>`;

function carregaAgente(a){
    a = 5;
    fetch("http://localhost:8080/agentesfinanceiros/"+a+"/dashboard")
        .then(res => res.json())
        .then(res => preencheAgente(res));
}

function preencheAgente(resJson){
    console.log(resJson);
    var ag = resJson;
    var novaLinha = templateAg.replace("**PARCEIRO**",ag.nome)
                                .replace("**VOLUME**",ag.volume)
                                .replace("**OK**",ag.statusOk)
                                .replace("**FALHAS**",ag.statusFalha)
                                .replace("**FRAUDES**",ag.statusFraude);
    document.getElementById("agente").innerHTML = novaLinha;
}
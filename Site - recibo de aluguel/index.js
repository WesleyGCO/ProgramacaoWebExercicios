function formatarCPFouCNPJ(valor) {
    valor = valor.replace(/\D/g, ""); // Remove tudo que não for dígito

    if (valor.length <= 11) { // CPF
        valor = valor.replace(/(\d{3})(\d)/, "$1.$2");
        valor = valor.replace(/(\d{3})(\d)/, "$1.$2");
        valor = valor.replace(/(\d{3})(\d{1,2})$/, "$1-$2");
    } else { // CNPJ
        valor = valor.replace(/^(\d{2})(\d)/, "$1.$2");
        valor = valor.replace(/^(\d{2})\.(\d{3})(\d)/, "$1.$2.$3");
        valor = valor.replace(/\.(\d{3})(\d)/, ".$1/$2");
        valor = valor.replace(/(\d{4})(\d)/, "$1-$2");
    }

    return valor;
}

function formatarNumero(input) {
    let num = input.value.replace(/\D/g, ''); //Remove qualquer caractere não numérico
    if (num.length > 0) { // Verifica se a string não é vazia
        num = parseInt(num, 10) / 100; // Se for um número válido, ele será dividido por 100 para termos duas casas decimais a esquerda
        // Realiza a conversão do número no formato local, que no caso é BRASIL
        input.value = num.toLocaleString('pt-BR', { minimumFractionDigits: 2 });
    }
}

function formatarCEP(input) {
    let cep = input.value.replace(/\D/g, ''); //Remove qualquer caractere não numérico
    if (cep.length > 0) { // Verifica se a string não é vazia
        cep = cep.substring(0, 5) + '-' + cep.substring(5);
    }
    input.value = cep;
}

function imprimirRecibo() {

    window.print();
}

function gerarRecibo() {
    //Mes
    const mes_refInput1 = document.getElementById("mes_referencia").value;
    document.getElementById("mesFinal1").innerHTML = mes_refInput1;

    const mes_refInput2 = document.getElementById("mes_referencia").value;
    document.getElementById("mesFinal2").innerHTML = mes_refInput2;

    //Ano
    const ano_refInput1 = document.getElementById("ano_ref").value;
    document.getElementById("anoFinal1").innerHTML = ano_refInput1;

    const ano_refInput2 = document.getElementById("ano_ref").value;
    document.getElementById("anoFinal2").innerHTML = ano_refInput2;

    //Valor
    const valorInput1 = document.getElementById("valor").value;
    document.getElementById("valorFinal1").innerHTML = valorInput1;

    const valorInput2 = document.getElementById("valor").value;
    document.getElementById("valorFinal2").innerHTML = valorInput2;

    //Locatario
    const locatarioInput = document.getElementById("locatario").value;
    document.getElementById("locatarioFinal").innerHTML = locatarioInput;

    //Locador
    const locadorInput1 = document.getElementById("locador").value;
    document.getElementById("locadorFinal1").innerHTML = locadorInput1;

    const locadorInput2 = document.getElementById("locador").value;
    document.getElementById("locadorFinal2").innerHTML = locadorInput2;

    //Endereço
    const ruaInput = document.getElementById("rua_imovel_locado").value;
    document.getElementById("ruaFinal").innerHTML = ruaInput;

    const numeroInput = document.getElementById("num_imovel_locado").value;
    document.getElementById("numeroFinal").innerHTML = numeroInput;

    const bairroInput = document.getElementById("bairro_imovel_locado").value;
    document.getElementById("bairroFinal").innerHTML = bairroInput;

    //Cidade
    const cidadeInput1 = document.getElementById("cidade_imovel_locado").value;
    document.getElementById("cidadeFinal1").innerHTML = cidadeInput1;

    const cidadeInput2 = document.getElementById("cidade_imovel_locado").value;
    document.getElementById("cidadeFinal2").innerHTML = cidadeInput2;

    //Estado
    const estadoInput = document.getElementById("estado_ref").value;

    if (estadoInput == "acre") {
        document.getElementById("estadoFinal").innerHTML = "AC";
    } else if (estadoInput == "alagoas") {
        document.getElementById("estadoFinal").innerHTML = "AL";
    } else if (estadoInput == "amapa") {
        document.getElementById("estadoFinal").innerHTML = "AP";
    } else if (estadoInput == "amazonas") {
        document.getElementById("estadoFinal").innerHTML = "AM";
    } else if (estadoInput == "bahia") {
        document.getElementById("estadoFinal").innerHTML = "BA";
    } else if (estadoInput == "ceara") {
        document.getElementById("estadoFinal").innerHTML = "CE";
    } else if (estadoInput == "distrito_federal") {
        document.getElementById("estadoFinal").innerHTML = "DF";
    } else if (estadoInput == "espirito_santo") {
        document.getElementById("estadoFinal").innerHTML = "ES";
    } else if (estadoInput == "goias") {
        document.getElementById("estadoFinal").innerHTML = "GO";
    } else if (estadoInput == "maranhao") {
        document.getElementById("estadoFinal").innerHTML = "MA";
    } else if (estadoInput == "mato_grosso") {
        document.getElementById("estadoFinal").innerHTML = "MT";
    } else if (estadoInput == "mato_grosso_sul") {
        document.getElementById("estadoFinal").innerHTML = "MS";
    } else if (estadoInput == "minas_gerais") {
        document.getElementById("estadoFinal").innerHTML = "MG";
    } else if (estadoInput == "para") {
        document.getElementById("estadoFinal").innerHTML = "PA";
    } else if (estadoInput == "paraiba") {
        document.getElementById("estadoFinal").innerHTML = "PB";
    } else if (estadoInput == "parana") {
        document.getElementById("estadoFinal").innerHTML = "PR";
    } else if (estadoInput == "pernambuco") {
        document.getElementById("estadoFinal").innerHTML = "PE";
    } else if (estadoInput == "piaui") {
        document.getElementById("estadoFinal").innerHTML = "PI";
    } else if (estadoInput == "rio_de_janeiro") {
        document.getElementById("estadoFinal").innerHTML = "RJ";
    } else if (estadoInput == "rio_grande_do_norte") {
        document.getElementById("estadoFinal").innerHTML = "RN";
    } else if (estadoInput == "rio_grande_do_sul") {
        document.getElementById("estadoFinal").innerHTML = "RS";
    } else if (estadoInput == "rondonia") {
        document.getElementById("estadoFinal").innerHTML = "RO";
    } else if (estadoInput == "roraima") {
        document.getElementById("estadoFinal").innerHTML = "RR";
    } else if (estadoInput == "santa_catarina") {
        document.getElementById("estadoFinal").innerHTML = "SC";
    } else if (estadoInput == "sao_paulo") {
        document.getElementById("estadoFinal").innerHTML = "SP";
    } else if (estadoInput == "sergipe") {
        document.getElementById("estadoFinal").innerHTML = "SE";
    } else if (estadoInput == "tocantis") {
        document.getElementById("estadoFinal").innerHTML = "TO";
    } 
    



    //CEP
    const cepInput = document.getElementById("cep_imovel_locado").value;
    document.getElementById("cepFinal").innerHTML = cepInput;

    //Imovel
    const imovelInput = document.getElementById("tipo_imovel_locado").value;
    document.getElementById("imovelFinal").innerHTML = imovelInput;

    //Data
    document.getElementById("dataAtual").innerHTML = exibirDataAtual();
}


function exibirDataAtual() {
    const dataAtual = new Date();
    const dia = dataAtual.getDate().toString().padStart(2, '0');
    const mes = (dataAtual.getMonth() + 1).toString().padStart(2, '0'); // janeiro é o mês 0, então adicionamos 1 para obter o mês atual
    const ano = dataAtual.getFullYear();

    const dataFormatada = `${dia}/${mes}/${ano}`;
    return dataFormatada;
}

inputData = document.getElementById("dataNascimento");
inputSubmit = document.getElementById("id-botao");
inputSubmit.setAttribute("disabled", "true");

function validaData(dataString) {
  let data = new Date(dataString);
  return !isNaN(data.getTime());
}

function transformaString() {
  let dataArray = inputData.value.split("/");
  let dia = dataArray[0];
  let ano = dataArray[2];
  let mes = dataArray[1];
  let dataPadraoDate = `${ano}-${mes}-${dia}`;

  return dataPadraoDate;
}


function validaTamanhoData() {
  const data = inputData.value;
  if (data.length === 10) {
    return true;
  } else {
    return false;
  }
}

inputData.addEventListener("input", function () {
  inputSubmit.setAttribute("disabled", "true");
  console.log("Bloqueado!");

  if (validaTamanhoData() && validaData(transformaString())) {
    inputSubmit.removeAttribute("disabled");
    console.log("Aprovado!");
  }
});

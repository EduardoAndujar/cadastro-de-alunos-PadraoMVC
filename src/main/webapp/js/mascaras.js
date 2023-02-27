$(document).ready(function() {
  $('#idNome').on('input', function() {
    $(this).val($(this).val().replace(/[0-9]/g, ''));
  });
});

$(document).ready(function() {
  $('#idSobrenome').on('input', function() {
    $(this).val($(this).val().replace(/[0-9]/g, ''));
  });
});

$(document).ready(function() {
	$('#dataNascimento').mask('00/00/0000');
});

$(document).ready(function() {
  $('#idCPF').mask('000.000.000-00');
});

$(document).ready(function() {
  $('#idCEP').mask('00000-000');
});
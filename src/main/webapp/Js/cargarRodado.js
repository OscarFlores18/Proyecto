function cargarRodado(id, patente, motor, color) {
    $("#id").val(id);
    $("#patente").val(patente);
    $("#motor").val(motor);
    $("#color").val(color);

    $(".modalRodado").modal("show");
}
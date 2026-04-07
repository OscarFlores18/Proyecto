function guardarRodado() {

    let patente = $("#patente").val();
    let motor = $("#motor").val();
    let color = $("#color").val();

    console.log("click guardar"); // para probar

    $.ajax({
        url: contextPath + '/CrearRodado',
        type: 'POST',
        data: {
            patente: patente,
            motor_rodaje: motor,
            color: color
        },
        success: function() {
            alert("Guardado correctamente");
            listarRodados();
        },
        error: function() {
            alert("Error al guardar");
        }
    });
}
tabla += `
    <tr>
        <td>${r.id}</td>
        <td>${r.patente}</td>
        <td>${r.motor_rodaje}</td>
        <td>${r.color}</td>
        <td>
            <button class="btn btn-warning"
                onclick="cargarRodado(${r.id}, '${r.patente}', '${r.motor_rodaje}', '${r.color}')">
                Editar
            </button>

            <button class="btn btn-danger"
                data-id="${r.id}"
                onclick="eliminarRodado(this)">
                Eliminar
            </button>
        </td>
    </tr>
`;
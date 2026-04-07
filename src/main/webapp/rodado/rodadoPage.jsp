<%@page import="java.util.*"%>
<%@page import="com.sample.core.domain.Rodado"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rodados</title>

<link rel="stylesheet"
    href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">

<script src="<%=request.getContextPath()%>/scripts/jquery/jquery.min.js"></script>

<script src="<%=request.getContextPath()%>/scripts/listarRodados.js"></script>
<script src="<%=request.getContextPath()%>/scripts/agregarRodado.js"></script>
<script src="<%=request.getContextPath()%>/scripts/eliminarRodado.js"></script>

<script>
    var contextPath = '<%=request.getContextPath()%>';
</script>

</head>

<body>

<div class="container mt-4">

    <a class="btn btn-primary" data-toggle="modal" data-target=".modalRodado">
        Nuevo
    </a>

    <br><br>

    <table class="table table-bordered">
        <thead>
            <tr>
                <th>ID</th>
                <th>Patente</th>
                <th>Motor</th>
                <th>Color</th>
                <th>Acciones</th>
            </tr>
        </thead>

        <tbody id="tablaRodados">
        </tbody>
    </table>

</div>

<div class="modal fade modalRodado">
    <div class="modal-dialog">
        <div class="modal-content">

            <div class="container mt-4">

                <h3>Agregar Rodado</h3>

                <input type="hidden" id="id">

                <input type="text" id="patente" class="form-control"
                    placeholder="Patente"><br>

                <input type="text" id="motor" class="form-control"
                    placeholder="Motor"><br>

                <input type="text" id="color" class="form-control"
                    placeholder="Color"><br>

                <button class="btn btn-success" onclick="guardarRodado()">
                    Guardar
                </button>

            </div>

        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>

</body>
</html>
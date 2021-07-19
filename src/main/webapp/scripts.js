$(document).ready(function() {
    $("#tablita").dynamicTable({
        //definimos las columnas iniciales    
        columns: [{
                text: "SUCURSAL",
                key: "name"
            },
            {
                text: "CLIENTE",
                key: "age"
            },
            {
                text: "FECHA",
                key: "gender"
            },
            {
                text: "DOCUMENTO",
                key: "pais"
            },
        ],

        //carga de datos
        data: [{
                name: 'Cuidado de la Salud',
                age: 4,
                gender: 'Z',
                pais: 'Benjamin Huamani'
            },
            {
                name: 'Diseño de Interiores',
                age: 5,
                gender: 'M',
                pais: 'Josue Diaz'
            },
            {
                name: 'Gestión de Información',
                age: 4,
                gender: 'Z',
                pais: 'Paulo Huaman'
            },
            {
                name: 'Gestión de Innovación',
                age: 6,
                gender: 'M',
                pais: 'Dany Vallejos'
            }
        ],

        //definición de botones
        buttons: {
            addButton: '<input type="button" value="Nuevo" class="btn btn-success" />',
            cancelButton: '<input type="button" value="Cancelar" class="btn btn-primary" />',
            deleteButton: '<input type="button" value="X" class="btn btn-danger" />',
            editButton: '<input type="button" value="E" class="btn btn-warning" />',
            saveButton: '<input type="button" value="Guardar" class="btn btn-success" />',
        },
        showActionColumn: true,
        //condicionales
        getControl: function(columnKey) {
            if (columnKey == "age") {
                return '<input type="number" class="form-control" />';
            }

            if (columnKey == "gender") {
                return '<select class="form-control"><option value = "Z" > Zoom </option><option value = "M" > Google Meet </option></select> ';
            }

            return '<input type="text" class="form-control" />';
        }

    });
});
# ProyectoIntermodularDaw1
# Dia 1

| David Prado | Coordinador |
| --- | --- |
| David Llanillo | Diseñar base de datos |
| Aymane Laaziri | Creación del proyecto de Github |
| Asier | Diseñar base de datos |
| Angel | Creación del proyecto de Github |

## Actividades a realizar

- Asignar las tareas a cada uno (David Prado)
- Crear el proyecto en github (David Prado)
- Diseñar la base de datos (David Prado)
- Implementar la base de datos (David Llanillo y Aymane)
- Crear la máquina de producción (Asier)
- Diseñar la página web (David Llanillo y Aymane)

Actividades realizadas

## Diseño de la base de datos

Datos que queremos guardar en la base de datos:

Clientes:

- identificador UUID
- dni
- nombre
- apellidos
- telefono
- direccion
- localidad
- fecha nacimiento

Perfil de cliente:

- credenciales de acceso a la web de banco,
- situacion civil,
- situacion laboral
- morosidad
- procesoJudicial
- estadoCivil
- conyuge
- enGananciales

Cuenta Bancaria:

- IBAN
- tipoDeCuenta
- saldoActual
- dineroUltimaNomina
- mediaNominas

MovimientoCliente:

- numeroOperacion
- cantidad
- conceptoOperacion
- emisor
- destinatario

Prestamo preconcedido:

- id
- fechaPrestamo
- cantidadPrestada
- periodoPrestamo
- tipoDeInteres
- plazoDeConfirmacion

Prestamo concedido:

- fechaDeFirma
- idPrestamoPreconcedido
- cantidadAmortizadaMensualmente

PagosPrestamos:

- numpago
- fechaPago
- cantidadPago

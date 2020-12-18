$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/AltaCliente.feature");
formatter.feature({
  "name": "Funcionalidad Alta clientes",
  "description": "  Validar que se permita el alta de clientes Persona Fisica",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Alta Clientes Persona Fisica",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Ingresa al sistema satisfactoriamente",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.Steps.ingresaSatisfactoriamente() in file:/C:/Users/larasr/eclipse2-workspace/SCENIC1prueba/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Usuario Ingresa Seccion Clientes",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Steps.seccionCliente() in file:/C:/Users/larasr/eclipse2-workspace/SCENIC1prueba/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario Ingresa datos mínimos de captura",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Steps.usuarioIngresaDatosMínimosDeCaptura() in file:/C:/Users/larasr/eclipse2-workspace/SCENIC1prueba/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario captura datos generales",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Steps.usuarioCapturaDatosGenerales() in file:/C:/Users/larasr/eclipse2-workspace/SCENIC1prueba/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario captura Lugar de nacimiento",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Steps.usuarioCapturaLugarDeNacimiento() in file:/C:/Users/larasr/eclipse2-workspace/SCENIC1prueba/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario captura domicilios",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Steps.usuarioCapturaDomicilios() in file:/C:/Users/larasr/eclipse2-workspace/SCENIC1prueba/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario ingresa Telefonos",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Steps.usuarioIngresaTelefonos() in file:/C:/Users/larasr/eclipse2-workspace/SCENIC1prueba/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario ingresa ocupacion",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Steps.usuarioIngresaocupacion() in file:/C:/Users/larasr/eclipse2-workspace/SCENIC1prueba/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario ingresa percepcion mensual",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Steps.usuarioIngresaPercepcionMensualNgreosMensual() in file:/C:/Users/larasr/eclipse2-workspace/SCENIC1prueba/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario ingresa perfil transaccional",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Steps.usuarioIngresaPerfilTransaccional() in file:/C:/Users/larasr/eclipse2-workspace/SCENIC1prueba/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Usuario ingresa Declaracion de impuestos",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Steps.usuarioIngresaDeclaracionDeImpuestos() in file:/C:/Users/larasr/eclipse2-workspace/SCENIC1prueba/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Usuario ingresa Aviso de Privacidad",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Steps.usuarioIngresaAvisoDePrivasidad() in file:/C:/Users/larasr/eclipse2-workspace/SCENIC1prueba/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Captura Folio",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Steps.CapturaFolio() in file:/C:/Users/larasr/eclipse2-workspace/SCENIC1prueba/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
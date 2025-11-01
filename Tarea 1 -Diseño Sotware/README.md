PetDayCare - Java project final (aligned to provided UML diagrams)
----------------------------------------------------------------
This project is a refined Java implementation aligned with the class diagram
and the three sequence diagrams you provided (Reservation flow, Payment flow,
Incident management flow). It removes the previous ReservaManager (not present
in your UML) and distributes responsibilities among the controller classes
and services that appear in your diagrams (Sistema / ReservaController,
VerificadorDisponibilidad, BloqueadorCupos, ProcesadorPago, GestorIncidente, etc.).

How to compile:
  javac -d out src/com/petdaycare/*.java
How to run demo:
  java -cp out com.petdaycare.MainDemoFinal

What was aligned to the diagrams:
- Methods used in the sequence diagrams exist and are implemented as minimal,
  demonstrative logic: consultarReservas, solicitarReservaServicio, procesarPago,
  confirmarPago, liberarBloqueo, ingresarGestorIncidente, solicitarMasDetalles, 
  cambiarEstadoIncidente, activarCasoDeUso, resolverEquipoGeneral, etc.
- Notification & blocking and availability checks are present.
- SOLID rationale included in comments inside key classes.

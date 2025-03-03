# BMI-Berechnung mit gRPC für Java #

<br>

Diese Repo enthält Java-Client (aber nicht den Server) für die Durchführung einer Berechnung des
[Body Mass Index (BMI)](https://www.apotheken-umschau.de/gesund-bleiben/abnehmen/body-mass-index-den-bmi-berechnen-706435.html)
über [gRPC](https://www.ionos.de/digitalguide/server/knowhow/grpc-vorgestellt/) in Form eines Maven-Projekts.

<br>

Bei erfolgreicher Ausführung von [proto2java.bat](proto2java.bat) werden in [src/main/java/bmi](src/main/java/bmi)
die Java-Dateien mit den Stubs abgelegt.

<br>

Der in [diesem Repo](https://github.com/MDecker-MobileComputing/Nodejs_gRPC_BMI) enthaltene Server mit Node.js
(verwendet selbe `.proto`-Datei) muss laufen, bevor der Client in diesem Repo ausgeführt werden.

<br>

----

## License ##

<br>

See the [LICENSE file](LICENSE.md) for license rights and limitations (BSD 3-Clause License)
for the files in this repository.

<br>
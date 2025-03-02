# Über diesen Ordner #

<br>

Dieser Ordner enthält die Binaries, die vom Skript `proto2java.bat` benötigt werden:
* Compiler `protoc`: Download unter https://github.com/protocolbuffers/protobuf/releases/ (stabile Version, keine `-rc`-Version)
* Compiler-Plugin für Java: Auf [dieser Seite](https://mvnrepository.com/artifact/io.grpc/protoc-gen-grpc-java) neueste 
  (stabile) Version raussuchen, dann auf "Files: View All" klicken.
  Im darauf erscheinenden Verzeichnis (z.B. [dieses hier](https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.70.0/)) 
  das Binary für Windows herunterladen und in diesem Ordner ablegen. 
  Im Skript `proto2java.bat` ggf. noch die im Wert von Option `--plugin` referenzierte Versionsnummer anpassen.

<br>

Beispielinhalt für diesen Ordner:
```
protoc.exe
protoc-gen-grpc-java-1.70.0-windows-x86_64.exe
```

<br>
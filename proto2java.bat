
@REM https://www.baeldung.com/grpc-introduction#1-using-protocol-buffer-compiler

@echo.

set BINFOLDER=protoc-tools

%BINFOLDER%\protoc.exe --plugin=protoc-gen-grpc-java=%BINFOLDER%\protoc-gen-grpc-java-1.70.0-windows-x86_64.exe --java_out=src --grpc-java_out=src bmi_berechnung.proto

@echo.

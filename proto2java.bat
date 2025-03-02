
@REM https://www.baeldung.com/grpc-introduction#1-using-protocol-buffer-compiler

@echo.

set BINFOLDER=protoc-tools
set OUTFOLDER=src/main/java

%BINFOLDER%\protoc.exe ^
  --plugin=protoc-gen-grpc-java=%BINFOLDER%\protoc-gen-grpc-java-1.70.0-windows-x86_64.exe ^
  --java_out=%OUTFOLDER% ^
  --grpc-java_out=%OUTFOLDER% ^
  bmi_berechnung.proto

@echo.

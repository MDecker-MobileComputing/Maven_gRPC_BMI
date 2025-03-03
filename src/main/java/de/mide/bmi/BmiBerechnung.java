package de.mide.bmi;

import bmi.BmiBerechnung.BmiEingabe;
import bmi.BmiBerechnung.BmiErgebnis;
import bmi.BmiDienstGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


/**
 * gRPC-Client nach https://www.baeldung.com/grpc-introduction#creating-the-client
 */
public class BmiBerechnung {

	/**
	 * Einstiegsmethode.
	 * 
	 * @param args Kommandozeilenargumente, werden nicht ausgewertet.
	 */
    public static void main( String[] args ) {

        System.out.println();
        
        final ManagedChannel channel = 
                ManagedChannelBuilder.forAddress( "localhost", 50051 )
                                     .usePlaintext()
                                     .build();
        
        final BmiDienstGrpc.BmiDienstBlockingStub stub = 
                    BmiDienstGrpc.newBlockingStub( channel );
        
        final BmiEingabe eingabe = 
                BmiEingabe.newBuilder()
                          .setGewichtKg( 77 )
                          .setKoerpergroesseCm( 175 )
                          .build();
        
        final BmiErgebnis ergebnis = stub.berechneBmi( eingabe );

        final float  bmiWert = ergebnis.getBmiWert();
        final String bmiInterpretation = ergebnis.getBmiInterpretation();
        
        final float bmiWertGerundet = Math.round( bmiWert * 10 ) / 10.0f;
        
        System.out.println( "BMI-Wert     : " + bmiWertGerundet   );
        System.out.println( "BMI-Kategorie: " + bmiInterpretation );
        
        System.out.println();
    }
    
}

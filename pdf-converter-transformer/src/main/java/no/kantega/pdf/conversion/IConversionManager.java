package no.kantega.pdf.conversion;

import java.io.File;
import java.util.concurrent.Future;

public interface IConversionManager {

    Future<Boolean> startConversion(File source, File target);

    boolean isOperational();

    void shutDown();
}

package org.example;

import com.google.cloud.functions.BackgroundFunction;
import com.google.cloud.functions.Context;

import java.util.logging.Logger;

public class Main implements BackgroundFunction<Main.GCSEvent> {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    @Override
    public void accept(GCSEvent event, Context context) {
        logger.info("Processing file: " + event.name);
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static class GCSEvent {
        String bucket;
        String name;
        String metageneration;
    }
}
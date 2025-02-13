package org.example.piped_streams_inter_thread_communication;

import java.io.IOException;
import java.io.PipedOutputStream;
//WriterThread-> extends Thread class for writing data from separate thread
class WriterThread extends Thread {
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from WriterThread!";
            pos.write(message.getBytes());
            pos.close();
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }
    }
}

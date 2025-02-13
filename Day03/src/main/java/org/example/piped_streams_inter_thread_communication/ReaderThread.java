package org.example.piped_streams_inter_thread_communication;

import java.io.IOException;
import java.io.PipedInputStream;
//ReaderThread-> extends Thread class for reading data in separate thread
class ReaderThread extends Thread {
    private PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try {
            int data;
            while ((data = pis.read()) != -1) {
                System.out.println((char) data);
            }
            pis.close();
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}

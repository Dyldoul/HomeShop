package com.dylan.homeshop.homeshop;

public interface Writer {


    /**
     * Start without process
     */
    public void start();


    /**
     * Write a line
     * @param line
     */
    public void writeLine(String line);


    /**
     * Stop writing process
     */
    public void stop();

}

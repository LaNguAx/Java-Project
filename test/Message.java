package test;

import java.util.Date;

public class Message {
    public final byte[] data;
    public final String asText;
    public final double asDouble;
    public final Date date;



    public Message(String message) {
        this.data = message.getBytes();
        this.asText = message;
        this.asDouble = this.parseDoubleOrNaN(message);
        this.date = new Date();
    }

    public Message(byte[] data) {
        this(new String(data));
    }
    public Message(double d) {
        this(Double.toString(d));
    }
    private double parseDoubleOrNaN(String s) {
        try {
            return Double.parseDouble(s);

        }catch(NumberFormatException e) {
            return Double.NaN;
        }
    }

}

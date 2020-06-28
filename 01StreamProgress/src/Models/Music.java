/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import Interface.IStreamable;
/**
 *
 * @author User
 */
public class Music implements IStreamable {
    private String artist;
    private String album;
    private int Length;
    private int BytesSent;
       
        public Music(String artist, String album, int length, int bytesSent)
        {
            this.artist = artist;
            this.album = album;
            Length = length;
            BytesSent = bytesSent;
        }

    @Override
    public int getLength() {
       return this.Length ;
    }

    @Override
    public int getBytesSent() {
        return this.BytesSent;
    }
    public void setLength(int length) {
        this.Length = length;
    }

    public void setBytesSent(int bytesSent) {
        this.BytesSent = bytesSent;
    }
    
}

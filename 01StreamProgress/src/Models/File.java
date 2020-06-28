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
public class File implements IStreamable {
     private String name;
     int Length;
     int BytesSent;

    public File(String name, int length, int bytesSent)
    {
        this.name = name;
        this.Length = length;
        this.BytesSent = bytesSent;
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

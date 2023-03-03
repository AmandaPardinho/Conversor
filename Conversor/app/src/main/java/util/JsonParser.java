/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author amand
 */
public class JsonParser {
    public static String jsonEmString(BufferedReader buffereReader) throws IOException{
        String resposta, jsonEmString = "";
        while((resposta = buffereReader.readLine()) != null){
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
}

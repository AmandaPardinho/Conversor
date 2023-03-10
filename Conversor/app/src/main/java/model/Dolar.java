/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import util.JsonParser;
/**
 *
 * @author amand
 */
public class Dolar {
    public static String precoDolar()throws Exception{
        try {
            URL url = new URL("https://economia.awesomeapi.com.br/last/USD-BRL,EUR-BRL,BTC-BRL");
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            
            if(conexao.getResponseCode() != 200){
                throw new RuntimeException("codigo de erro" + conexao.getResponseCode());
            }
            
            BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            
            String convercao = JsonParser.jsonEmString(resposta);
            
            JSONObject obj = new JSONObject(convercao);
            
            String valorMoeda = obj.getJSONObject("USDBRL").getString("bid");
            return valorMoeda;
            
        } catch (IOException | RuntimeException e) {
            throw new Exception(e);
        }
    }
    
    public static double valorDolar() throws Exception{
        String dolar = precoDolar();
        double dolarValor = Double.parseDouble(dolar);
        
        return dolarValor;
    }
    
    public static String valorDolarString() throws Exception{
        return String.format("%.2f", valorDolar());
    }
    
    public static double converterDolar(double valor, double dolarValor){
        return valor*dolarValor;
    }
}

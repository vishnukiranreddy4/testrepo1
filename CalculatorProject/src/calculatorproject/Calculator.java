package calculatorproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

import javax.jws.WebService;


@WebService
public class Calculator {
    public Calculator() {
        super();
        
    }
      
    public float add(float a,float b){
        float c=a+b;
        return c;
        }
    public float sub(float a,float b){
        float c=a-b;
        return c;
        }
    public float div(float a,float b){
        float c=a/b;
        return c;
        }
    public float mul(float a,float b){
        float c=a*b;
        return c;
        }
   
}

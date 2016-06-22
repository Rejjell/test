package com.example.rummezheni.remotecontrol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import com.example.rummezheni.remotecontrol.Constants;


/**
 * Created by rummezheni on 21.06.2016.
 */
public class RemoteConsole {

    public static void main (String[] args){
        System.out.print("Hello");
    }

    private void openSocket(){
        //String hostName = args[0];
        //int portNumber = Integer.parseInt(args[1]);
/*
        try {
            ServerSocket echoSocket = new ServerSocket(Constants.PORT);
            PrintWriter out =
                    new PrintWriter(echoSocket.getOutputStream(), true);
            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(echoSocket.getInputStream()));
            BufferedReader stdIn =
                    new BufferedReader(
                            new InputStreamReader(System.in));
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
*/
    }

    private void closeSocket(){

    }

    private void parseCommand(){

    }

    private void executeCommand(){

    }
}

# Java Simple Chat Client

This program is a simple chat client that allows you to connect to a server, send messages, and receive messages from the server and potentially other clients.

## Requirements
User __must__ have JDK 22 to run this program 
Can get it from here:
> https://www.oracle.com/jp/java/technologies/downloads/

## Features
- Connects to a server at a specified IP address and port (default 7777).
- Prompts the user for a username to identify themselves on the server.
- Sends messages typed by the user to the server.
- Receives messages from the server and displays them on the console. (STILL NOT IMPLEMENTED)

## Explanation of the Code
- Program.java: This class contains the main function of the client. It prompts the user for the server address and username, attempts to connect to the server, and enters a loop that continuously sends messages entered by the user and receives messages from the server.
- The program uses a Scanner object to get user input for server address and username.
- It establishes a connection to the server using a Socket object.
- It uses InputStream and OutputStream objects to communicate with the server (send and receive messages).
- The program keeps trying to connect to the server in a loop if the connection is lost.

![image](https://github.com/Civermau/GroupChatClient/assets/66493296/ea633f81-2cf7-4441-be01-a1a316f848b9)

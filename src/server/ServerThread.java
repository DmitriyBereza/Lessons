package server;

import dao.ArticleDaoHolder;
import entity.Article;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class ServerThread implements Runnable{
    private Socket s;
    private InputStream is;
    private OutputStream os;

    public ServerThread(Socket serverSocket) throws IOException {
        this.s = serverSocket;
        this.is = serverSocket.getInputStream();
        this.os = serverSocket.getOutputStream();
    }

    @Override
    public void run() {
        try {
            readInputHeaders();
            List<Article> list = ArticleDaoHolder.INSTANCE.getArticleDao().selectAll();
            String s = "";
            for (Article article: list){
                s += article.toString();
            }
            writeResponse(s);
        } catch (Throwable t) {
            t.printStackTrace();
                /*do nothing*/
        } finally {
            try {
                s.close();
            } catch (Throwable t) {
                t.printStackTrace();
                    /*do nothing*/
            }
        }

        System.err.println("Client "+Thread.currentThread().getName()+" processing finished");
    }

    private void writeResponse(String s) throws Throwable {
        String response = "HTTP/1.1 200 OK\r\n" +
                "ServerThread: YarServer/2009-09-09\r\n" +
                "Content-Type: text/html\r\n" +
                "Content-Length: " + s.length() + "\r\n" +
                "Connection: close\r\n\r\n";
        String result = response + s;
        os.write(result.getBytes());
        os.flush();
    }

    private void readInputHeaders() throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while(true) {
            String s = br.readLine();
            if(s == null || s.trim().length() == 0) {
                break;
            }
        }
    }
}
